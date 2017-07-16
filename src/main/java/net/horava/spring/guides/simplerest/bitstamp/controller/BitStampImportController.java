package net.horava.spring.guides.simplerest.bitstamp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;

import net.horava.spring.guides.simplerest.bitstamp.controller.dto.BitStampTickerImportDto;
import net.horava.spring.guides.simplerest.bitstamp.entity.BitStampTicker;

/**
 * @author Martin Horava
 */
@Component
public class BitStampImportController {

    @Autowired
    RestTemplateBuilder restTemplateBuilder;

    public BitStampTicker getTicker() {
        BitStampTickerImportDto bitStampTicker = restTemplateBuilder.build()
            .getForObject("https://www.bitstamp.net/api/v2/ticker/btcusd/", BitStampTickerImportDto.class);

        return new BitStampTicker()
            .withAsk(bitStampTicker.getAsk())
            .withBid(bitStampTicker.getBid())
            .withHigh(bitStampTicker.getHigh())
            .withLast(bitStampTicker.getLast())
            .withLow(bitStampTicker.getLow())
            .withOpen(bitStampTicker.getOpen())
            .withTimestamp(bitStampTicker.getTimestamp())
            .withVwap(bitStampTicker.getVwap());
    }
}

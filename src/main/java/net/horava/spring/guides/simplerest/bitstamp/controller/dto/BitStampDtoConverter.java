package net.horava.spring.guides.simplerest.bitstamp.controller.dto;

import java.time.Instant;
import java.util.TimeZone;

import net.horava.spring.guides.simplerest.bitstamp.entity.BitStampTicker;

/**
 * @author Martin Horava
 */
public class BitStampDtoConverter {

    public static BitStampTickerDto convert(BitStampTicker bitStampTicker) {
        return new BitStampTickerDto()
            .withId(bitStampTicker.getId())
            .withAsk(bitStampTicker.getAsk())
            .withBig(bitStampTicker.getBid())
            .withOpen(bitStampTicker.getOpen())
            .withHigh(bitStampTicker.getHigh())
            .withLast(bitStampTicker.getLast())
            .withLow(bitStampTicker.getLow())
            .withTimestamp(Instant.ofEpochSecond(bitStampTicker.getTimestamp())
                .atZone(TimeZone.getDefault().toZoneId())
                .toLocalDateTime())
            .withVwap(bitStampTicker.getVwap());
    }

    private BitStampDtoConverter() {
    }

}

package net.horava.spring.guides.simplerest.bitstamp.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.horava.spring.guides.simplerest.bitstamp.BitStampManager;
import net.horava.spring.guides.simplerest.bitstamp.controller.dto.BitStampDtoConverter;
import net.horava.spring.guides.simplerest.bitstamp.controller.dto.BitStampTickerDto;

/**
 * @author Martin Horava
 */
@RestController
public class BitStampController {

    @Autowired
    private BitStampManager bitStampManager;

    @RequestMapping(value = "/bitstamp", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<BitStampTickerDto> getAllTickers() {
        return bitStampManager.getAllTickers().stream()
            .map(bitStampTicker -> BitStampDtoConverter.convert(bitStampTicker))
            .collect(Collectors.toList());
    }

}

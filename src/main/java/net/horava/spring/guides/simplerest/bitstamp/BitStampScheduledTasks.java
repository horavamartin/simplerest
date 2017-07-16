package net.horava.spring.guides.simplerest.bitstamp;

import java.text.SimpleDateFormat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import net.horava.spring.guides.simplerest.bitstamp.controller.BitStampImportController;
import net.horava.spring.guides.simplerest.bitstamp.entity.BitStampTicker;

/**
 * @author Martin Horava
 */
@Component
public class BitStampScheduledTasks {

    private static final Logger logger = LoggerFactory.getLogger(BitStampScheduledTasks.class);

    private final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");

    @Autowired
    private BitStampImportController bitStampImportController;

    @Autowired
    private BitStampManager bitStampManager;

    @Scheduled(fixedRateString = "${bitstamp.scheduler.rate}")
    public void getTicker() {
        BitStampTicker ticker = bitStampImportController.getTicker();
        logger.info("Get ticker: {}", ticker.toString());
        bitStampManager.insertTicker(ticker);
    }

}

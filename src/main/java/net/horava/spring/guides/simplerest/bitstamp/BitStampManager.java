package net.horava.spring.guides.simplerest.bitstamp;

import net.horava.spring.guides.simplerest.bitstamp.entity.BitStampDao;
import net.horava.spring.guides.simplerest.bitstamp.entity.BitStampTicker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Martin Horava
 */
@Component
public class BitStampManager {

    private static final Logger logger = LoggerFactory.getLogger(BitStampTicker.class);

    @Autowired
    private BitStampDao bitStampDao;

    public void insertTicker(BitStampTicker bitStampTicker) {
        logger.info("Insert " + bitStampTicker);
        bitStampDao.save(bitStampTicker);
    }

    public List<BitStampTicker> getAllTickers() {
        List<BitStampTicker> bitStampTickers = new ArrayList<>();
        bitStampDao.findAll().forEach(bitStampTicker -> bitStampTickers.add(bitStampTicker));
        return bitStampTickers;
    }

}

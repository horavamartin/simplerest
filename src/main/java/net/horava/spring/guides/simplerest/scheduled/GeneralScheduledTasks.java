package net.horava.spring.guides.simplerest.scheduled;

import net.horava.spring.guides.simplerest.GreetingResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Martin on 6/17/2017.
 */
@Component
public class GeneralScheduledTasks {

    private static final Long FIXED_RATE_MILISECONDS = 3000L;

    private static final Logger LOGGER = LoggerFactory.getLogger(GeneralScheduledTasks.class);

    @Autowired
    RestTemplateBuilder restTemplateBuilder;

    private final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");


    @Scheduled(fixedRate = 1000)
    public void reportCurrentTime() {
        LOGGER.info("The time is {}", simpleDateFormat.format(new Date()));
    }

    @Scheduled(fixedRate = 3000)
    public void sayHello() {
        GreetingResponse greetingResponse = restTemplateBuilder.build().getForObject("http://localhost:8080/simplerest/api/greeting", GreetingResponse.class);
        LOGGER.info("Get greeting: {}", greetingResponse.toString());
    }


}

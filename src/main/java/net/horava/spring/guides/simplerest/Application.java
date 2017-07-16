package net.horava.spring.guides.simplerest;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.WebApplicationInitializer;


/**
 * @author Martin Horava
 */
@Configuration
@ComponentScan
@EnableAutoConfiguration
@EnableScheduling
public class Application extends SpringBootServletInitializer implements WebApplicationInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder applicationBuilder) {
        return applicationBuilder.sources(Application.class);
    }

}

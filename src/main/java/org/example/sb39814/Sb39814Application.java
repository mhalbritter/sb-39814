package org.example.sb39814;

import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.message.MapMessage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Sb39814Application {

    private static final Logger LOGGER = LogManager.getLogger(Sb39814Application.class);

    public static void main(String[] args) {
        LOGGER.info(new MapMessage<>(Map.of("key-1", "value-1", "key-2", "value-2")));
        SpringApplication.run(Sb39814Application.class, args);
    }

}

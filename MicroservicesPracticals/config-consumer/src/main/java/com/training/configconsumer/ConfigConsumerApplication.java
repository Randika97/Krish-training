package com.training.configconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.bootstrap.BootstrapConfiguration;

@SpringBootApplication
public class ConfigConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigConsumerApplication.class, args);
    }

}

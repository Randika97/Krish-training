package com.training.krish.microservicespracticals;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@EnableConfigServer
public class MicroservicesPracticalsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicesPracticalsApplication.class, args);
    }

}

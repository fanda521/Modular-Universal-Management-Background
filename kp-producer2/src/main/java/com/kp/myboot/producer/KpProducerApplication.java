package com.kp.myboot.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages = {"com.kp.myboot.producer"})
@EnableDiscoveryClient
public class KpProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(KpProducerApplication.class, args);
    }

}

package com.kp.myboot.backup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages = {"com.kp.myboot"})
@EnableDiscoveryClient
public class KpBackupApplication {

    public static void main(String[] args) {
        SpringApplication.run(KpBackupApplication.class, args);
    }

}

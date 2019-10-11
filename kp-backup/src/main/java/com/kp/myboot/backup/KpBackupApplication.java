package com.kp.myboot.backup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.kp.myboot"})
public class KpBackupApplication {

    public static void main(String[] args) {
        SpringApplication.run(KpBackupApplication.class, args);
    }

}

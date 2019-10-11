package com.kp.myboot.monitor;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer //监听服务
public class KpMonitorApplication {

    public static void main(String[] args) {
        SpringApplication.run(KpMonitorApplication.class, args);
    }

}

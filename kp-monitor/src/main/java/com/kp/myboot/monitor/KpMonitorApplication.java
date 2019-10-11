package com.kp.myboot.monitor;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableAdminServer //监听服务
@EnableDiscoveryClient//开启服务发现注册
public class KpMonitorApplication {

    public static void main(String[] args) {
        SpringApplication.run(KpMonitorApplication.class, args);
    }

}

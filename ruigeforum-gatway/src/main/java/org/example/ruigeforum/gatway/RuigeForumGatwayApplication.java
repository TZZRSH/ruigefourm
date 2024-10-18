package org.example.ruigeforum.gatway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: zhao_rui
 * @Desc:
 * @create: 2024-10-13 21:11
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class RuigeForumGatwayApplication {
    public static void main(String[] args) {
        SpringApplication.run(RuigeForumGatwayApplication.class, args);
    }
}

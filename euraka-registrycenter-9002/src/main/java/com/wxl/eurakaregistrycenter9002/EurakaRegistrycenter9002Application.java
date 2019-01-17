package com.wxl.eurakaregistrycenter9002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurakaRegistrycenter9002Application {

  public static void main(String[] args) {
    SpringApplication.run(EurakaRegistrycenter9002Application.class, args);
  }

}


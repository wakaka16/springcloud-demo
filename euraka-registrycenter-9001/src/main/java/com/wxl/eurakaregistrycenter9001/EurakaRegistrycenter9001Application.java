package com.wxl.eurakaregistrycenter9001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurakaRegistrycenter9001Application {

  public static void main(String[] args) {
    SpringApplication.run(EurakaRegistrycenter9001Application.class, args);
  }

}


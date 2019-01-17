package com.wxl.orderservice6001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class OrderService6001Application {

  public static void main(String[] args) {
    SpringApplication.run(OrderService6001Application.class, args);
  }

}


package com.wxl.userservice7001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UserService7001Application {

  public static void main(String[] args) {
    SpringApplication.run(UserService7001Application.class, args);
  }

}


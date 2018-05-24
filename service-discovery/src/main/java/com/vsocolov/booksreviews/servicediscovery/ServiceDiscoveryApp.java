package com.vsocolov.booksreviews.servicediscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ServiceDiscoveryApp {

  public static void main(final String[] args) {
    SpringApplication.run(ServiceDiscoveryApp.class, args);
  }
}

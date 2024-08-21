package com.Eshwary.Cloud_application.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")

public class Health {


  @GetMapping("/health")
  public String health() {
    return "UP";
  }

  @GetMapping("/greet")
  public String greet() {
    return "Hello, welocome to Eshwary Cloud Application";
  }
}

package com.carmen.springboot.error.springbooterror.controllers;

import org.springframework.web.bind.annotation.GetMapping;

public class AppController {

      @GetMapping("/app")
      public String index() {
          int value = 100 / 0;
          System.out.println(value);
          return "ok 200";
      }

}

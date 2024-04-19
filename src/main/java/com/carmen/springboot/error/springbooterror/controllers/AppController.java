package com.carmen.springboot.error.springbooterror.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.carmen.springboot.error.springbooterror.exceptions.UserNotFoundException;
import com.carmen.springboot.error.springbooterror.models.domain.User;
import com.carmen.springboot.error.springbooterror.services.UserService;

public class AppController {

    @Autowired
      private UserService service;

      @GetMapping("/app")
      public String index() {
          int value = Integer.parseInt("20x");
          System.out.println(value);
          return "ok 200";
      }

      @GetMapping("/show/{id}")
      public User show(@PathVariable(name = "id") Long id) {
          User user = service.findById(id).orElseThrow(() -> new UserNotFoundException("Error el usuario no existe!"));
          System.out.println(user.getLastname());
          return user;
      }

}

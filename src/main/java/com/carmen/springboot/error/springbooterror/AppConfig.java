package com.carmen.springboot.error.springbooterror;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.carmen.springboot.error.springbooterror.models.domain.Role;
import com.carmen.springboot.error.springbooterror.models.domain.User;

@Configuration
public class AppConfig {
    
    @Autowired
    Role role;

      @Bean
      List<User> users() {
          List<User> users = new ArrayList<>();
          users.add(new User(1L, "Pepe", "Gonzalez", role));
          users.add(new User(2L, "Andres", "Mena", role));
          users.add(new User(3L, "Maria", "Perez", role));
          users.add(new User(4L, "Josefa", "Ramirez", role));
          users.add(new User(5L, "Ale", "Gutierrez", role));
          return users;
      }
}

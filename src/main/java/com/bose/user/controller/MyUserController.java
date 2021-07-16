package com.bose.user.controller;

import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class MyUserController {

  @PostMapping
  public HttpEntity<String> saveUser() {
    return null;
  }

}

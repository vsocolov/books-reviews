package com.vsocolov.booksreviews.usersservice.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

import static com.vsocolov.booksreviews.usersservice.controllers.UserController.USER_ROOT_PATH;

@RestController
@RequestMapping(USER_ROOT_PATH)
public class UserController {
  static final String USER_ROOT_PATH = "/user";

  @RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
  public List<String> userList() {
    return Collections.singletonList("vlad");
  }
}

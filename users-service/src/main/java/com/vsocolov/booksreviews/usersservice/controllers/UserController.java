package com.vsocolov.booksreviews.usersservice.controllers;

import com.vsocolov.booksreviews.usersservice.model.User;
import com.vsocolov.booksreviews.usersservice.services.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.vsocolov.booksreviews.usersservice.controllers.UserController.USER_ROOT_PATH;

@RestController
@RequestMapping(USER_ROOT_PATH)
public class UserController {
  static final String USER_ROOT_PATH = "/user";

  private final UserServiceImpl userService;

  @Autowired
  public UserController(UserServiceImpl userService) {
    this.userService = userService;
  }

  @RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
  public List<User> userList() {
    return userService.findAll();
  }
}

package com.vsocolov.booksreviews.usersservice.controllers;

import com.vsocolov.booksreviews.usersservice.model.User;
import com.vsocolov.booksreviews.usersservice.services.impl.UserServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import static com.vsocolov.booksreviews.usersservice.controllers.UserController.USER_ROOT_PATH;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@Api(tags = "User Resource Endpoint")
@RequestMapping(USER_ROOT_PATH)
public class UserController {
  static final String USER_ROOT_PATH = "/user";

  private final UserServiceImpl userService;

  @Autowired
  public UserController(UserServiceImpl userService) {
    this.userService = userService;
  }

  @ApiOperation(value = "List all users.", response = User.class, responseContainer = "List")
  @RequestMapping(produces = APPLICATION_JSON_VALUE, method = GET)
  public List<User> userList() {
    return userService.findAll();
  }

  @ApiOperation(value = "Extract user by userId.", response = User.class)
  @RequestMapping(path = "/{id}", produces = APPLICATION_JSON_VALUE, method = GET)
  public Optional<User> get(@PathVariable("id") final Long id) {
    return userService.get(id);
  }
}

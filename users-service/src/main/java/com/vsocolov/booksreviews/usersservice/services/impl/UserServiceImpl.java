package com.vsocolov.booksreviews.usersservice.services.impl;

import com.vsocolov.booksreviews.usersservice.model.User;
import com.vsocolov.booksreviews.usersservice.repositories.UserRepository;
import com.vsocolov.booksreviews.usersservice.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

  private final UserRepository userRepository;

  @Autowired
  public UserServiceImpl(final UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public List<User> findAll() {
    return userRepository.findAll();
  }
}

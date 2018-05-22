package com.vsocolov.booksreviews.usersservice.services;

import com.vsocolov.booksreviews.usersservice.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
  List<User> findAll();

  Optional<User> get(Long id);
}

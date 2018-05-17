package com.vsocolov.booksreviews.usersservice.services;

import com.vsocolov.booksreviews.usersservice.model.User;

public interface UserService {
  Iterable<User> findAll();
}

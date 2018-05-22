package com.vsocolov.booksreviews.booksservice.services;

import com.vsocolov.booksreviews.booksservice.model.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {
  List<Book> findAll();

  Optional<Book> get(Long id);
}

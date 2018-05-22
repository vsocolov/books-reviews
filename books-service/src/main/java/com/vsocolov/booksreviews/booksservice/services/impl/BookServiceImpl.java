package com.vsocolov.booksreviews.booksservice.services.impl;

import com.vsocolov.booksreviews.booksservice.model.Book;
import com.vsocolov.booksreviews.booksservice.repositories.BookRepository;
import com.vsocolov.booksreviews.booksservice.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

  private final BookRepository bookRepository;

  @Autowired
  public BookServiceImpl(final BookRepository bookRepository) {
    this.bookRepository = bookRepository;
  }

  @Override
  public List<Book> findAll() {
    return bookRepository.findAll();
  }

  @Override
  public Optional<Book> get(final Long id) {
    return bookRepository.findById(id);
  }
}

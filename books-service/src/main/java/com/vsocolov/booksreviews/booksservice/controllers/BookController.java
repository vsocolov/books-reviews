package com.vsocolov.booksreviews.booksservice.controllers;

import com.vsocolov.booksreviews.booksservice.model.Book;
import com.vsocolov.booksreviews.booksservice.services.BookService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import static com.vsocolov.booksreviews.booksservice.controllers.BookController.BOOK_ROOT_PATH;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@Api(tags = "Book Resource Endpoint")
@RequestMapping(BOOK_ROOT_PATH)
public class BookController {
  static final String BOOK_ROOT_PATH = "/book";

  private final BookService bookService;

  @Autowired
  public BookController(final BookService bookService) {
    this.bookService = bookService;
  }

  @ApiOperation(value = "List all books.", response = Book.class, responseContainer = "List")
  @RequestMapping(produces = APPLICATION_JSON_VALUE, method = GET)
  public List<Book> userList() {
    return bookService.findAll();
  }

  @ApiOperation(value = "Extract book by bookId.", response = Book.class)
  @RequestMapping(path = "/{id}", produces = APPLICATION_JSON_VALUE, method = GET)
  public Optional<Book> get(@PathVariable("id") final Long id) {
    return bookService.get(id);
  }

}

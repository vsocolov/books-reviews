package com.vsocolov.booksreviews.booksservice.repositories;

import com.vsocolov.booksreviews.booksservice.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}

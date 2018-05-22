package com.vsocolov.booksreviews.booksservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = Book.BOOKS)
public class Book implements Serializable {

  static final String BOOKS = "books";
  private static final String NAME = "name";
  private static final String DESCRIPTION = "description";
  private static final String PUBLICATION_YEAR = "publication_year";

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = NAME)
  private String name;

  @Column(name = DESCRIPTION)
  private String lastName;

  @Column(name = PUBLICATION_YEAR)
  private int publicationYear;

  public Book() {
    super();
  }

  public Long getId() {
    return id;
  }

  public void setId(final Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(final String name) {
    this.name = name;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(final String lastName) {
    this.lastName = lastName;
  }

  public int getPublicationYear() {
    return publicationYear;
  }

  public void setPublicationYear(final int publicationYear) {
    this.publicationYear = publicationYear;
  }
}

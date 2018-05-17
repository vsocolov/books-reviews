package com.vsocolov.booksreviews.usersservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = User.USERS)
public class User implements Serializable {

  static final String USERS = "users";
  private static final String FIRST_NAME = "first_name";
  private static final String LAST_NAME = "last_name";
  private static final String BIRTH_DATE = "birth_date";

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(name = FIRST_NAME)
  private String firstName;

  @Column(name = LAST_NAME)
  private String lastName;

  @Column(name = BIRTH_DATE)
  private LocalDate birthDate;

  public User() {
    super();
  }

  public User(final String firstName, final String lastName, final LocalDate birthDate) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.birthDate = birthDate;
  }

  public Long getId() {
    return id;
  }

  public void setId(final Long id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(final String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(final String lastName) {
    this.lastName = lastName;
  }

  public LocalDate getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(final LocalDate birthDate) {
    this.birthDate = birthDate;
  }
}

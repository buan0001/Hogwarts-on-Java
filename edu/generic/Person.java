package edu.generic;

public class Person {

  String lastName;
  String firstName;
  String middleName;

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public Person(String lastName, String firstName, String middleName) {
    this.lastName = lastName;
    this.firstName = firstName;
    this.middleName = middleName;
  }

  public String toString(){
    return lastName + " " + firstName + " " + middleName;
  }

  public Person(){}
}

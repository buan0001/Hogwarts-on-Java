public class Person {

  String lastName;
  String firstName;
  String middleName;

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

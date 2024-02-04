public class Student extends Person {

  int enrollmentYear;
  int graduationYear;
  boolean graduated;

  public Student(
    String lastName,
    String firstName,
    String middleName,
    int enrollmentYear,
    int graduationYear,
    boolean graduated
  ) {
    super(lastName,firstName,middleName);
    this.enrollmentYear = enrollmentYear;
    this.graduationYear = graduationYear;
    this.graduated = graduated;
  }
}

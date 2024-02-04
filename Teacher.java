import java.time.*;
public class Teacher extends Person {

   String employment;
   LocalDate employmentStart;
   LocalDate employmentEnd;

  public Teacher(String lastName, String firstName, String middleName,
    String employment,
    String employmentStart,
    String employmentEnd
  ) {
    super(lastName, firstName, middleName);
    this.employment = employment;
    this.employmentStart = LocalDate.parse(employmentStart);
    this.employmentEnd = LocalDate.parse(employmentEnd);
  }

  public Teacher() {}
}

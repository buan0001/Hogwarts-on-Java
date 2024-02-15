package edu.generic;

import java.time.*;
public class Teacher extends Person {

   String employment;

    public String getEmployment() {
        return employment;
    }

    public void setEmployment(String employment) {
        this.employment = employment;
    }

    public LocalDate getEmploymentStart() {
        return employmentStart;
    }

    public void setEmploymentStart(LocalDate employmentStart) {
        this.employmentStart = employmentStart;
    }

    public LocalDate getEmploymentEnd() {
        return employmentEnd;
    }

    public void setEmploymentEnd(LocalDate employmentEnd) {
        this.employmentEnd = employmentEnd;
    }

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
    public Teacher(String lastName, String firstName, String middleName,
                   String employment,
                   LocalDate employmentStart,
                   LocalDate employmentEnd
    ) {
        super(lastName, firstName, middleName);
        this.employment = employment;
        this.employmentStart = employmentStart;
        this.employmentEnd = employmentEnd;
    }

  public Teacher() {}
}

package edu.hogwarts.data.people;

import edu.generic.Teacher;
import edu.hogwarts.data.school.House;

public class HogwartsTeacher extends Teacher {

  private House house;
  private boolean headOfHouse;

  public House getHouse() {
    return house;
  }

  public void setHouse(House house) {
    this.house = house;
  }

  public boolean isHeadOfHouse() {
    return headOfHouse;
  }

  public void setHeadOfHouse(boolean headOfHouse) {
    this.headOfHouse = headOfHouse;
  }

  public HogwartsTeacher(
    String lastName,
    String firstName,
    String middleName,
    String employment,
    String employmentStart,
    String employmentEnd,
    House house,
    boolean headOfHouse
  ) {
    super(lastName, firstName, middleName, employment, employmentStart, employmentEnd);
    this.house = house;
    this.headOfHouse = headOfHouse;
  }

  public HogwartsTeacher(HogwartsTeacher copyTeacher) {
    super(copyTeacher.getLastName(), copyTeacher.getFirstName(), copyTeacher.getMiddleName(), copyTeacher.getEmployment(),
            copyTeacher.getEmploymentStart(), copyTeacher.getEmploymentEnd());
    this.house = copyTeacher.getHouse();
    this.headOfHouse = copyTeacher.isHeadOfHouse();
  }

  public HogwartsTeacher() {}

  public String toString(){
    String msg = "\n lastname " + getLastName() + "\n firstname " + getFirstName() + "\n middlename " + getMiddleName() + "\n employment " +getEmployment() +
    "\n employmentstart " +getEmploymentStart() + "\n employmentend " +getEmploymentEnd() + "\n house " + house + "\n head of house " +headOfHouse;
    return msg;
  }
}

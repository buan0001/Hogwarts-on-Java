import java.time.*;
public class HogwartsTeacher extends Teacher {

  private House house;
  private boolean headOfHouse;

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

  public HogwartsTeacher() {}

  public String toString(){
    String msg = "lastname " + lastName + "\n firstname " + firstName + "\n middlename " + middleName + "\n employment " +employment +
    "\n employmentstart " +employmentStart + "\n employmentend " +employmentEnd + "\n house " + house + "\n head of house " +headOfHouse;
    return msg;
  }
}

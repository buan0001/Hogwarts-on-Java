package edu.hogwarts.data.people;

import edu.generic.Student;
import edu.hogwarts.data.school.House;

public class HogwartsStudent extends Student {
    private House house;
    private boolean prefect;
    private String[] teams;

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public boolean isPrefect() {
        return prefect;
    }

    public void setPrefect(boolean prefect) {
        this.prefect = prefect;
    }

    public String[] getTeams() {
        return teams;
    }

    public void setTeams(String[] teams) {
        this.teams = teams;
    }

    public HogwartsStudent(String lastName, String firstName, String middleName, int enrollmentYear,
                           int graduationYear, boolean graduated, House house, boolean prefect, String[] teams) {
        super( lastName, firstName, middleName,enrollmentYear,graduationYear,graduated);
        this.house = house;
        this.prefect = prefect;
        this.teams = teams;
    }

    public HogwartsStudent(HogwartsStudent copyStudent) {
        super( copyStudent.getLastName(), copyStudent.getFirstName(), copyStudent.getMiddleName(), copyStudent.getEnrollmentYear(),copyStudent.getGraduationYear(),copyStudent.isGraduated());
        this.house = copyStudent.house;
        this.prefect = copyStudent.prefect;
        this.teams = copyStudent.teams;

    }

      public String toString(){
        String teamsMsg = "";
        for (String team : teams) {
            teamsMsg += team + " ";
        }
    String msg = "\n lastname " + getLastName() + "\n firstname " + getFirstName() + "\n middlename " + getMiddleName() + "\n enrollmentYear " +getEnrollmentYear() +
    "\n graduationYear " +getGraduationYear() + "\n graduated " +isGraduated() + "\n house " + house + "\n prefect " +prefect + "\n teamsMsg " + teamsMsg;
    return msg;
  }
}
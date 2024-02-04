public class HogwartsStudent extends Student {
    private House house;
    private boolean prefect;
    private String[] teams;

    public HogwartsStudent(String lastName,String firstName,String middleName,int enrollmentYear,
    int graduationYear, boolean graduated, House house, boolean prefect, String[] teams) {
        super( lastName, firstName, middleName,enrollmentYear,graduationYear,graduated);
        this.house = house;
        this.prefect = prefect;
        this.teams = teams;
    }

      public String toString(){
        String teamsMsg = "";
        for (String team : teams) {
            teamsMsg += team + " ";
        }
    String msg = "\n lastname " + lastName + "\n firstname " + firstName + "\n middlename " + middleName + "\n enrollmentYear " +enrollmentYear +
    "\n graduationYear " +graduationYear + "\n graduated " +graduated + "\n house " + house + "\n prefect " +prefect + "\n teamsMsg " + teamsMsg;
    return msg;
  }
}
import java.time.*;
public class App {

  public static void main(String[] args) {
    App app = new App();
    app.start();
  }

  public void start() {
    // Subject newSubject = new Subject("Potions");
    var slytherin = new House("Slytherin", "idk lol", new String[]{"Green", "Yellow"});
    HogwartsTeacher newTeacher = new HogwartsTeacher(
      "Severus",
      "Snape",
      null,
      "Teacher",
      "1991-04-05",
      "1997-11-11",
      slytherin,
      true
    );
    System.out.println(newTeacher);
    // // var test = new Person("a", "b","c");
  }
}

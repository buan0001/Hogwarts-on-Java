package edu.hogwarts.application;

public class App {
  UserInterface inter = new UserInterface();
  TeacherController teachCont = new TeacherController();
  StudentController studentCont = new StudentController();
  InitData dataStart;

  public static void main(String[] args) {
    App app = new App();
    app.start();
  }

  public void start() {
    dataStart = new InitData(teachCont, studentCont);
  }
}

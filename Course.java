public class Course {

  Subject subject;
  Teacher teacher;
  HogwartsStudent[] students;
  TeachingMaterial[] materials;

  public Course(
    Subject subject,
    Teacher teacher,
    HogwartsStudent[] students,
    TeachingMaterial[] materials
  ) {
    this.subject = subject;
    this.teacher = teacher;
    this.students = students;
    this.materials = materials;
  }

  public String toString(){
    String studentMsg = "";
        for (HogwartsStudent student : students) {
            studentMsg += student + " ";
        }
    String materialMsg = "";
        for (TeachingMaterial material : materials) {
            materialMsg += material + " ";
        }
    String msg = "\n subject " + subject + "\n teacher " + teacher + "\n teacher " + teacher + "\n students " +studentMsg +
    "\n materials " +materialMsg;
    return msg;
  }
}

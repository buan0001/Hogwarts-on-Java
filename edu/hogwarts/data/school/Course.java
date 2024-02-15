package edu.hogwarts.data.school;

import edu.generic.Teacher;
import edu.hogwarts.data.school.TeachingMaterial;
import edu.hogwarts.data.people.HogwartsStudent;

public class Course {

  Subject subject;
  Teacher teacher;

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public HogwartsStudent[] getStudents() {
        return students;
    }

    public void setStudents(HogwartsStudent[] students) {
        this.students = students;
    }

    public TeachingMaterial[] getMaterials() {
        return materials;
    }

    public void setMaterials(TeachingMaterial[] materials) {
        this.materials = materials;
    }

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

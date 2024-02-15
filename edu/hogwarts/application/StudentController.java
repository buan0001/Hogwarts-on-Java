package edu.hogwarts.application;

import edu.generic.Student;
import edu.hogwarts.data.people.HogwartsStudent;

import java.util.HashMap;
import java.util.List;

public class StudentController {

    private HashMap<Integer, HogwartsStudent> allStudents = new HashMap<>();

    private int idCount = 1;
    public void createStudent(HogwartsStudent newStud) {
        allStudents.put(idCount, new HogwartsStudent(newStud));
        idCount++;
    }

    public HogwartsStudent getStudent(int id) {
        return allStudents.get(id);
    }
//    public List<HogwartsStudent> getAllStudents() {
//        return allStudents;
//    }

//    public HogwartsStudent updateStudent(int id, HogwartsStudent updated) {
//        return HogwartsStudent;
//    }
//    public HogwartsStudent deleteStudent(int id) {
//        return HogwartsStudent;
//    }
}

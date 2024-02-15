package edu.hogwarts.application;

import edu.generic.Student;
import edu.generic.Teacher;
import edu.hogwarts.data.people.HogwartsTeacher;

import java.util.HashMap;
import java.util.List;

public class TeacherController {

    private HashMap<Integer, HogwartsTeacher> allTeachers = new HashMap<>();

    private int idCount = 1;
    public void createTeacher(HogwartsTeacher newTeacher) {
        allTeachers.put(idCount, new HogwartsTeacher(newTeacher));
        idCount++;
    }

    public HogwartsTeacher getTeacher(int id) {
        return allTeachers.get(id);
    }
//    public List<HogwartsTeacher> getAllTeachers() {
//        return allTeachers;
//    }

    public void updateTeacher(int id, HogwartsTeacher updated) {
        //return Teacher;
    }
    public void deleteTeacher(int id) {
        //return Teacher;
    }
}

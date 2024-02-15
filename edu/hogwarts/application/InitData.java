package edu.hogwarts.application;

import edu.hogwarts.data.people.HogwartsStudent;
import edu.hogwarts.data.people.HogwartsTeacher;
import edu.hogwarts.data.school.*;

public class InitData {

    TeacherController teachers;
    StudentController students;
    public InitData(TeacherController teachers, StudentController students) {
        this.teachers = teachers;
        this.students = students;
    }
    public void initData(){
        var slytherin = new House("Slytherin","idk lol",new String[] { "Green", "Yellow" }    );
        var gryffindor = new House("Gryffindor","still no clue",new String[] { "red", "black", "white probably" }    );
        var snape = new HogwartsTeacher("Severus","Snape",null,"Teacher","1991-04-05","1997-11-11",slytherin,true);
        var ron = new HogwartsStudent("Weasley","Ron",null,2002, 2008, true, gryffindor, false, new String[] { "Quidditch" } );
        var harry = new HogwartsStudent("Potter","Harry","James",2002, 2008, true, gryffindor, false, new String[] { "Quidditch", "Dark arts practice" } );
        var testIngredient = new Ingredient("Orange garlic", true, false, true, "really cant beat orange garlic, it goes with everything", 62, "Cloves");

        var testTool = new Tool("Pestle and mortar", true,  true, false, "Please don't show up to my lessons without one","Used in crushing herbs and other potion ingredients");
        var potionSubject = new Subject("Potion making", 2007, true);
        var potionCourse = new Course(potionSubject, snape, new HogwartsStudent[]{harry, ron}, new TeachingMaterial[]{testIngredient, testTool} );

        System.out.println(potionCourse);
        students.createStudent(harry);

    }
}

package PACKAGE_NAME.CeyhuneMentor;

import PACKAGE_NAME.MapTask.Student;

public class Main {
    public static void main(String[] args) {


        Course<String> course = new Course<>("ATL Academy");
        course.addStudent(new Student("Emin",1));
        course.addStudent(new Student("Ismayil",2));
        course.addStudent(new Student("Aytac",3));
        course.showAllStudents();

    }
}

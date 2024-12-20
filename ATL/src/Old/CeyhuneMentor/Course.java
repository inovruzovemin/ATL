package PACKAGE_NAME.CeyhuneMentor;

import PACKAGE_NAME.MapTask.Student;

import java.util.ArrayList;
import java.util.List;

public class Course <T>{
    private String courseName;
    private List<Student> students;

    public Course(String courseName) {
        this.courseName = courseName;
        this.students= new ArrayList<>();
    }

    public void addStudent(Student student) {
    students.add(student);
        System.out.println(student.getName() + "added to the list");
    }
    public void showAllStudents() {
        System.out.println(students.toString());
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", students=" + students +
                '}';
    }
}

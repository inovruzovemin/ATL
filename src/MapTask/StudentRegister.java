package PACKAGE_NAME.MapTask;

import java.util.HashMap;
import java.util.Map;

public class StudentRegister {
  Map <Integer,Student> studentMap = new HashMap<>();

    public StudentRegister(Map<Integer, Student> studentMap) {
        this.studentMap = studentMap;
    }

    public StudentRegister() {

    }

    public void addStudent(Student student) {
        studentMap.put(student.getId(), student);
    }
    public void removeStudent(int studentId) {
        studentMap.remove(studentId);
        System.out.println("\nRemoved student " + studentId);
    }
    public Student findStudentById(int studentId) {
        return studentMap.get(studentId);
    }
    public void showAllStudents() {
        System.out.println("\nStudent List: ");
        for(Student student : studentMap.values()) {
            System.out.println(student);
        }
    }
}
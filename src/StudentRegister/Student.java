package PACKAGE_NAME.StudentRegister;

import java.util.Objects;

public class Student {
    private String studentName;
    private int studentId;

    public Student(String studentName, int studentId) {
        this.studentName = studentName;
        this.studentId = studentId;
        System.out.println("Student added: Student{name="+ studentName +",id="+ studentId + "}");
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "\nStudent{" +
                "name='" + studentName + '\'' +
                ", id=" + studentId +
                '}';
    }


    }


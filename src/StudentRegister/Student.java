package PACKAGE_NAME.StudentRegister;
import java.util.Objects;

public class Student {
    private String studentName;
    private int studentId;

    public Student(String studentName, int studentId) {
        this.studentName = studentName;
        this.studentId = studentId;
    }
    public String getStudentName() {
        return studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + studentName + '\'' +
                ",id=" + studentId +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentName,studentId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId && Objects.equals(studentName, student.studentName);
    }
}


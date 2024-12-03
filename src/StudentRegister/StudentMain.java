package PACKAGE_NAME.StudentRegister;

import java.time.LocalDate;

public class StudentMain {
    public static void main(String[] args) {
        System.out.println("Welcome to the Student Register.");

        Student[] student = new Student[5];
        student[0] = new Student("Emin", LocalDate.of(1999, 12, 20));
        student[1] = new Student("Huseyn", LocalDate.of(2004, 2, 23));
        student[2] = new Student("Asha", LocalDate.of(2008, 10, 10));
        student[3] = new Student("Ilkin", LocalDate.of(2009, 9, 3));
        student[4] = new Student("Ulker", LocalDate.of(1999, 11, 5));

        System.out.println("\n Student List:");
        for (Student student1 : student) {
            System.out.println(student1);
        }

        Student[] oldStudent = StudentAge.check18(student);

        System.out.println("\n 18 years old and older students :");

        for (Student student2 : oldStudent) {
            if (student2 != null) { // Null yoxlaması
                System.out.println(student2);
            }
        }

        Student[] youngStudent = StudentAge.uncheck18(student);

        System.out.println("\n Young student list:");

        for (Student student3 : youngStudent) {
            if (student3 != null) { // Null yoxlaması
                System.out.println(student3);
            }
        }
    }
}


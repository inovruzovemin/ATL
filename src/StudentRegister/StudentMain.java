package PACKAGE_NAME.StudentRegister;

import java.time.LocalDate;
import java.util.HashSet;

public class StudentMain {
    public static void main(String[] args) {
        System.out.println("Welcome to the Student Register.");

        HashSet<Student> set = new HashSet<>();
        set.add(new Student("Emin", LocalDate.of(1999, 12, 20)));
        set.add(new Student("Aliya", LocalDate.of(2008, 12, 24)));
        set.add(new Student("Nigar", LocalDate.of(2006, 12, 12)));
        set.add(new Student("Musa", LocalDate.of(1995, 12, 22)));
        set.add(new Student("Kamran", LocalDate.of(2009, 12, 5)));


        System.out.println("\n Student List:");
        for (Student student1 : set) {
            System.out.println(student1);
        }

        Student[] oldStudent = StudentAge.check18(set);

        System.out.println("\n 18 years old and older students :");

        for (Student student2 : oldStudent) {
            if (student2 != null) { // Null yoxlaması
                System.out.println(student2);
            }
        }

        Student[] youngStudent = StudentAge.uncheck18(set);

        System.out.println("\n Young student list:");

        for (Student student3 : youngStudent) {
            if (student3 != null) { // Null yoxlaması
                System.out.println(student3);
            }
        }
    }
}


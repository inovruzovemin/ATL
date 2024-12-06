package PACKAGE_NAME.MapTask;

import java.util.HashMap;
import java.util.Map;

public class Main {
        public static void main(String[] args) {
            StudentRegister register = new StudentRegister();
            register.addStudent(new Student("Alice", 1));
            register.addStudent(new Student("Bob", 2));
            register.addStudent(new Student("Charlie", 3));

            register.showAllStudents();

            register.removeStudent(2);

            register.showAllStudents();


        }
    }


package PACKAGE_NAME.StudentRegister;

import java.util.HashSet;

public class StudentAge {

        // 18 yaşı tamam olmuş tələbələri filtr edən metod
        public static Student[] check18(HashSet<Student> students) {
            Student[] result;
            result = new Student[students.size()];
            int index = 0;

            for (Student student : students) {
                if (student.studentAge() >= 18) { // Yaşı 18 və ya daha çoxdursa
                    result[index++] = student;
                }

            }
            return result;
        }
        public static Student[] uncheck18(HashSet<Student> students) {
            Student[] result = new Student[students.size()];
            int index = 0;
            for (Student student : students) {
                if (student.studentAge() < 18) {
                    result[index++] = student;
                }
            }
            return result;
        }
    }
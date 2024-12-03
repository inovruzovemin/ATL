package PACKAGE_NAME.StudentRegister;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class StudentAge {

        // 18 yaşı tamam olmuş tələbələri filtr edən metod
        public static Student[] check18(Student[] students) {
            Student[] result = new Student[students.length];
            int index = 0;

            for (Student student : students) {
                if (student.studentAge() >= 18) { // Yaşı 18 və ya daha çoxdursa
                    result[index++] = student;
                }

            }
            return result;
        }
        public static Student[] uncheck18(Student[] students) {
            Student[] result = new Student[students.length];
            int index = 0;
            for (Student student : students) {
                if (student.studentAge() < 18) {
                    result[index++] = student;
                }
            }
            return result;
        }
    }
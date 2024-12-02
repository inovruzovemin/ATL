package PACKAGE_NAME.StudentRegister;

import java.time.LocalDate;
import java.util.Scanner;

//Tələbə adı (String)+
//Doğum tarixi (LocalDate)+
//Tələbələri saxlayan array yaradın.Tələbələrin array-ini:+
//copy edin. +
//clon ilə yeni array-ə köçürün. +
//Tələbələrin yaşını hesablayın və
// yaşları 18-dən az olan tələbələri ayrı bir array-ə əlavə edin.
// LocalDate sinfi istifadə olunmalıdır.Array-lərlə işləmək üçün həm clone, həm də manual copy üsullarından istifadə edin.Tələbələrin yaşı LocalDate vasitəsilə hesablansın.Əlavə olaraq, tələbə əlavə və yaşı hesablama metodlarını sinifdə yazmağa çalışın.
//Ad: Hüseyn, Doğum tarixi: 2005-03-15
//Ad: Aydın, Doğum tarixi: 2010-07-20
//Ad: Tural, Doğum tarixi: 1995-11-05
//Clone edilmiş array.
//Manual copy edilmiş array.
//        18 yaşından kiçik tələbələr:
//Ad: Hüseyn
//Ad: Aydın
public class StudentMain {


    public static void main(String[] args) {
        System.out.println("Welcome to the Student Register.");
        Student[] student = new Student[5];
        student[0] = new Student("Emin", LocalDate.of(1999, 12, 20));
        student[1] = new Student("Huseyn", LocalDate.of(2004, 2, 23));
        student[2] = new Student("Asha", LocalDate.of(2008, 10, 10));
        student[3] = new Student("Ilkin", LocalDate.of(2009, 9, 3));
        student[4] = new Student("Ulker", LocalDate.of(1999, 11, 5));

        System.err.println("All students :");
        for (Student student1 : student) {
                System.out.println(student1);
            }
            // 18 yaşı tamam olmuş tələbələri tapırıq
            Student[] oldStudent = StudentAge.check18(student);

        // Nəticələri çap edirik
        System.err.println("18 years old and older students :");
            for (Student student2 : oldStudent) {
                if (student2 != null) { // Null yoxlaması
                    System.out.println(student2);
                }


            }
        }
    }


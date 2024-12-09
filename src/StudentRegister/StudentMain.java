package PACKAGE_NAME.StudentRegister;


import java.util.HashSet;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        HashSet <Student> studentCommunity = new HashSet<Student>();

        studentCommunity.add(new Student("Ilkin", 1));
        studentCommunity.add(new Student("Xan", 2));
        studentCommunity.add(new Student("Elnur", 3));
        studentCommunity.add(new Student("Emin", 4));
        studentCommunity.add(new Student("Musa", 5));
        studentCommunity.add(new Student("Huseyn", 6));
        studentCommunity.add(new Student("Tofiq", 3));
        studentCommunity.add(new Student("Tofiq", 3));



        for (Student element : studentCommunity) {
            System.out.print(element);
        }



        }
    }



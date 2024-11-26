package PACKAGE_NAME.ChatGPT;

import java.util.Scanner;

public class Task1 {
    //Task 1: Konsola "Hello, [adınız]!" yazısını çıxaran bir proqram yazın. +
    //Task 2: Scanner istifadə edərək, istifadəçidən adı və yaşı soruşun, +
    //sonra "Adınız [Ad], yaşınız [Yaş]" formatında məlumatı konsola yazdırın.
    public static void main() {
//        System.out.println("Hello World");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name : ");
        String name = sc.nextLine();
        System.out.print("Enter the age : ");
        int age = sc.nextInt();
        System.out.println(name + " " + age);

    }
}

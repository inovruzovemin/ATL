package PACKAGE_NAME.Soon;

import java.util.Scanner;

public class StopAndTotal {
//    İstifadəçidən eded daxil etməyi tələb edən proqram yazın.
//    Proqram bütün ededlərin cəmini göstərəcək.
//    İstifadəçi 0-a daxil olduqda proqram dayanır.
//    dayandiqdan sonra cem gorunsun.
//    meselen:
//    Əlavə etmək üçün eded daxil edin (dayandırmaq üçün 0 daxil edin):
//    eded daxil edin: 5
//    eded daxil edin: 10
//    eded daxil edin: -3
//    eded daxil edin: 0
//    Ümumi məbləğ: 12
public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            int sum = 0;
            int number;

            System.out.println("Enter a number to add (enter 0 to stop):");

            while (true) {
                System.out.print("Enter a numbe: ");
                number = scanner.nextInt();

                if (number == 0) {
                    break;
                }
                sum += number;
            }

            System.out.println("Total: " + sum);
        }
    }


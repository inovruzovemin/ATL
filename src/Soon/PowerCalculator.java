package PACKAGE_NAME.Soon;

import java.util.Scanner;

    public class PowerCalculator {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            System.out.print("Ədədi daxil edin: ");
            int number = scanner.nextInt();

            System.out.print("Qüvvəti daxil edin: ");
            int power = scanner.nextInt();


            int result = calculatePower(number, power);

            System.out.println(number + "^" + power + " = " + result);
        }


        public static int calculatePower(int number, int power) {
            int result = 1;


            for (int i = 1; i <= power; i++) {
                result *= number;
            }

            return result;
        }
    }


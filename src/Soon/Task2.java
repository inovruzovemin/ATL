package PACKAGE_NAME.Soon;

import java.util.Scanner;

public class Task2 {


    public class SumAndAverage {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[] arr = new int[5];
            int sum = 0;

            System.out.println("Enter 5 numbers:");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scanner.nextInt();
                sum += arr[i];
            }

            double average = sum / 5.0;

            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);
        }
    }
}


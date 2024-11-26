package PACKAGE_NAME.Soon;

import java.util.Scanner;

public class ArrayCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] arr = new int[5];

        System.out.println("Enter 5 numbers:");


        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter a number to count: ");
        int numberToCount = scanner.nextInt();


        int count = countOccurrences(arr, numberToCount);


        System.out.println("The number " + numberToCount + " appears " + count + " times.");
    }

    public static int countOccurrences(int[] arr, int number) {
        int count = 0;

        for (int num : arr) {
            if (num == number) {
                count++;
            }
        }

        return count;
    }
}

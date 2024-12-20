package PACKAGE_NAME;

public class BinarySearch {
    public static void main(String[] args) {
        int[] number = {1, 2, 5, 10, 25, 35, 50, 75, 100};
        int first = 0;
        int last = number.length - 1;
        int middle = (first + last) / 2;
        int search = 75;
        int count = 0; // 25,
        boolean founded= false;


            for (int f = 0; f < last; f++) {
                if (number[middle] == search) {
                    System.out.println("Search number found. Index N-" + middle);
                    founded= true;
                    break;
                } else if (number[middle] < search) {
                    first = middle + 1;
                    middle = (last + first) / 2;
                    count++;
                } else {
                    last = middle - 1;
                    middle = (last + first) / 2;
                    count++;
                }

            }
            System.out.print(founded ? "Count : " + count : "");
        System.out.println(!founded ? "Number not founded" : "");
        }

    }


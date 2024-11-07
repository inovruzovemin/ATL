import java.math.BigDecimal;
import java.util.Objects;
import java.util.Scanner;

public class ders11 {
    public static void main(String[] args) {

        System.out.print("4 reqemli eded daxil edin: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int a1 = a / 1000; // 1234 - 1
        int a2 = a / 100 % 10; // 1234 - 12
        int a3 = a / 10 % 10; // 1234  - 123
        int a4 = a % 10;

        boolean b = a4 > a3 && a3 > a2 & a2 > a1;


        System.out.print("4 reqemli eded sirasi duzdur mu? " + b);
    }
}

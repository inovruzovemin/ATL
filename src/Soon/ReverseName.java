package PACKAGE_NAME.Soon;

import java.util.Scanner;

public class ReverseName {

        public static void main(String[] args) {


            Scanner scanner = new Scanner(System.in);


            System.out.print("Adınızı daxil edin: ");
            String userName = scanner.nextLine();


            System.out.print("Adınızın tərsi: ");
            for (int i = userName.length() - 1; i >= 0; i--) {
                System.out.print(userName.charAt(i));
            }
            System.out.println();
        }
    }



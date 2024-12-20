package PACKAGE_NAME.Enum;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Week today = Week.MONDAY;
        switch (today) {
            case MONDAY:
            System.out.println("First day of the week");
            break;
            case TUESDAY:
            System.out.println("Second day of the week");
            break;
            case WEDNESDAY:
                System.out.println("Third day of the week");
                break;
                case THURSDAY:
                    System.out.println("Fourth day of the week");
                    break;
                    case FRIDAY:
                        System.out.println("Fifth day of the week");
                        break;
                        case SATURDAY:
                            System.out.println("First day of the weekend");
                            break;
                            case SUNDAY:
                                System.out.println("Second day of the weekend");
                                break;



        }
    }
}

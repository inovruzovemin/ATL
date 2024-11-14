import java.time.Month;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        İsdifadeci ayi daxil etsin hansi fesil olduğu çap edilsin .
//        Numune :
//        User'in daxil etdiyi ay  --> Yanvar
//        Netice ---> Qış fesli
        System.out.print("Ay daxil edin: ");
        Scanner sc= new Scanner(System.in);
        var a=sc.nextLine();

        switch (a) {
            case "Dekabr" :
            case "Yanvar" :
            case "Fevral" :
                System.out.println("Qış");
                break;

            case "Mart" :
            case "Aprel" :
            case "May" :
                System.out.println("Yaz");
                break;

            case "Iyun":
            case "Iyul":
            case "Avqust":
                System.out.print("Yay");
                break;

            case "Sentyabr":
            case "Oktyabr":
            case "Noyabr":
                System.out.print("Yay");
                break;


            default:
                System.out.println("Yazdiginiz ayi oxuya bilmedik.");
        }

    }
}
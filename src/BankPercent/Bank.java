package PACKAGE_NAME.BankPercent;
import java.util.Set;

public class Bank {
    public String name;

    public static void main(String[] args) {
        Bank bank = new Bank();
        Set<String> bankir = Set.of("Emin","Huseyn", "Ismayil","Ulker");
        bankir.stream()
                .filter(a ->  a.length() >= 5)
                .forEach(System.out::println);
            }

    }



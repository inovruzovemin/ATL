package PACKAGE_NAME.BankPercent;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

public class Bank {
    public String name;

    public Bank() {
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        Set<String> bankir = new HashSet<>();
        bankir.add("Emin");
        bankir.add("Ismayil");
        bankir.add("Ulker");
        bankir.add("Huseyn");

        bankir.stream()
                .filter(a ->  a.length() >= 5)
                .forEach(System.out::println);
            }

    }



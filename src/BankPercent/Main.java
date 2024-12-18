package PACKAGE_NAME.BankPercent;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Customer cust1 = new Customer("Musa", 500);
        Customer cust2 = new Customer("Isa", 6500);
        Customer cust3 = new Customer("Lisa", 357);
        Customer cust4 = new Customer("Nisa", 250);

        List<Customer> listed = new ArrayList<>();
        listed.add(cust1);
        listed.add(cust2);
        listed.add(cust3);
        listed.add(cust4);

        listed.stream()
                .filter(Customer ->Customer.getDebt()>350)
                .peek(Customer -> Customer.setDebt(Customer.getDebt()+50))
                .forEach(System.out::println);






    }
}

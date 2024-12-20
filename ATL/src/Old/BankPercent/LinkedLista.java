package PACKAGE_NAME.BankPercent;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedLista {

    public static void main(String[] args) {
        LinkedList<Integer> linkedlist = new LinkedList<>((Arrays.asList(1, 2, 3, 4, 85,54, 79,98)));
        linkedlist.stream()
                .filter(a->a%2==0)
                .map(a->a*2)
                .filter(a->a>20)
                .sorted()
                .forEach(System.out::println);

    }
}

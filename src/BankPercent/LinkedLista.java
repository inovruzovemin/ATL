package PACKAGE_NAME.BankPercent;

import java.util.LinkedList;

public class LinkedLista {

    public static void main(String[] args) {
        LinkedList<Integer> linkedlist = new LinkedList<>();
        linkedlist.add(1);
        linkedlist.add(2);
        linkedlist.add(11);
        linkedlist.add(22);
        linkedlist.add(21);
        linkedlist.add(12);
        linkedlist.stream()
                .filter(a->a%2==0)
                .map(a->a*2)
                .filter(a->a>20)
                .sorted()
                .forEach(System.out::println);




    }
}

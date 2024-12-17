package PACKAGE_NAME;

import PACKAGE_NAME.Sorta;

import java.util.*;

public class SortaMain {
    public static void main(String[] args) {

        Sorta emp1 = new Sorta("Huseyn", 5000, 24);
        Sorta emp2 = new Sorta("Emin", 5000, 25);
        Sorta emp3 = new Sorta("Ilkin", 5000, 23);


        var emplist = Arrays.asList(emp1,emp2,emp3);
        System.out.println((emplist));
        Collections.sort(emplist, new Sorta());

        System.out.println(emplist);

    }
}
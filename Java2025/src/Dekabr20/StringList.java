package Dekabr20;

import java.util.Arrays;
import java.util.List;

public class StringList {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("Emin","Aytac","Huseyn");

        var newList = myList.stream().map(a-> List.of(a.split(""))).toList();
        System.out.println(newList);

    }
}

package PACKAGE_NAME.Dekabr3;

import java.util.LinkedList;

public class ListMethod {
    public static void main(String[] args) {

    LinkedList<String> list = new LinkedList<>();
    list.add("Mercury");
    list.add("Venera");
    list.add("Earth");
    list.add("Mars");
    list.add("Jupiter");


        String Longs = list.get(2);
        for (String random : list) {
            if (random.length()>=Longs.length()) {
                Longs = random;
            }
        }
        System.out.println(Longs);


    }
}

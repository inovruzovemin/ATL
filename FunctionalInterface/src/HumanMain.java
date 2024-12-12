import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HumanMain {
//        public static void main(String[] args) {
//        Map<String,Integer> map =new HashMap<>();
//
//        ArrayList<Human> people = new ArrayList<>();
//        people.add(new Human(LocalDate.of(1999, 8, 8), 25, "Emin"));
//        people.add(new Human(LocalDate.of(2010, 8, 8),14, "Aysel"));
//        people.add(new Human(LocalDate.of(2013, 8, 8),17, "Vusal"));
//
//
//        for (Human person : people) {
//            map.put(person.getName(), person.getAge());
//        }
//        System.out.println(map);
//    }

    public static void main(String[] args) {
        var i = "*";
        var j = " ";
        int high = 4;
        for (int a = 0; a < high; a++) {
            for (int b = 0; b < high - a- 1; b++) {
                System.out.print(j);
            }
            for (int b = 0; b < 2*a+ 1; b++) {
                System.out.print(i);
            }
                System.out.println();
            }

        }
    }


import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class GenericArrayPrinter {

    public static <T> void printFilterArray (T[] array, Predicate<T> predicate, String message) {
        List<T> filteredList = Arrays.stream(array)
                .filter(predicate)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Integer[] intArray = {2,3,4,3,54,65523,423,432,54,345};
        String[] stringArray = {"Huseyn", "Aysu","Asha","Ilkin","Emin"};
        Double[] doubleArray = {1.0,2.5,8.6,5.6,8.5};



    }
}

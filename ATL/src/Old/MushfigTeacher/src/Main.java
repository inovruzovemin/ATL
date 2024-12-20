import java.util.function.*;

public class Main {
    public static void main(String[] args) {

        //Predicate receive object and return boolean
        CustomPredicate isEven = x -> x%2==0;
        System.out.println(isEven.emin(44));

        //Consumer receive object and return nothing, just printed
        CustomConsumer print = a -> System.out.println(a); // long version
        //Consumer<String> print = System.out::println;           // short version
        print.huseyn("Ezhel is the best Turkish rapper");

        //Function receive object and return other or same type object
        CustomFunction countryCode = (az)->az.length(); //long version
        //Function<String, Integer> countryCode = String::length;       //short version
        System.out.println("Azerbaijan");

        //BiFunction receive 2 object and return one other object
        CustomBiFunction sum = (a,b)->a+b; // long version
        //BiFunction<Integer, Integer, Integer> sum = Integer::sum;          // short version
        System.out.println(sum.musa(4,5));

        //Supplier receive nothing and return random number
        CustomSupplier random = () -> Math.random();  // long version
        //Supplier<Double> random = Math::random;      // short version
        System.out.println(random.asha());



    }
}
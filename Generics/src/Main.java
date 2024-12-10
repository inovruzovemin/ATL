public class Main {
    public static void main(String[] args) {
        Person<Integer> number = new Person<>(101);
        System.out.print(number.getName());

        Person<String> name = new Person<>("Java");
        System.out.print(name.getName());
    }
}
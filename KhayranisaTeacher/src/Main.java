public class Main {  // 13 november home task
    public static void main(String[] args) {

        Pair<String,Double> object1 = new Pair<>();
        object1.setValues("Sirab",1.5);
        object1.printValues();

        Pair<Float,Boolean> object2 = new Pair<>();
        object2.setValues(3.14f,true);
        object2.printValues();

    }
}
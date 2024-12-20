package PACKAGE_NAME.Birds;

public class main {
    public static void main(String[] args) {
 // for Eagle
    Eagle eagle = new Eagle("Eagle A",12,2.4);
        System.out.println(eagle);
        eagle.fly();
        eagle.hunt();

// for Budgerigar
        Budgerigar budgerigar = new Budgerigar("Budgerigar",2,true);
        System.out.println();
        System.out.println(budgerigar);
        budgerigar.fly();
        budgerigar.sing();

// for Parrot
        Parrots parrots = new Parrots("Parrot A", 3, "Mammamia");
        System.out.println();
        System.out.println(parrots);
        parrots.fly();
        parrots.speak();

    }
}

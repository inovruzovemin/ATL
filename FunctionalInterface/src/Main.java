public class Main {
    public static void main(String[] args) {
       CalculatorInterface sum = (a,b)-> a+b;
       CalculatorInterface decr = (a,b)-> a-b;
       CalculatorInterface multip = (a,b)-> a*b;

       CalculatorInterface xf = (a,b) ->

        System.out.println("Total : " + sum.operation(4,45));
        System.out.println("Decretion : " + decr.operation(54,45));
        System.out.println("Multi : " + multip.operation(4,5));
    }
}
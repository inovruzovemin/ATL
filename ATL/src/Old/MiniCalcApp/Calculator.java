package MiniCalcApp;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstNumber = sc.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = sc.nextInt();

        MiniCalcApp.Addition myAddition = new MiniCalcApp.Addition();
        myAddition.addition(firstNumber, secondNumber);
        System.out.println("Addition: " +  myAddition.addition(firstNumber, secondNumber));

        MiniCalcApp.Subtraction mySubtraction = new MiniCalcApp.Subtraction();
        mySubtraction.subtraction(firstNumber, secondNumber);
        System.out.println("Subtraction: " + mySubtraction.subtraction(firstNumber, secondNumber));

        MiniCalcApp.Multiplication myMultiplication = new MiniCalcApp.Multiplication();
        myAddition.addition(firstNumber, secondNumber);
        System.out.println("Multiplication: " +  myMultiplication.multiplication(firstNumber, secondNumber));

        MiniCalcApp.Division myDivision = new MiniCalcApp.Division();
        myDivision.division(firstNumber, secondNumber);
        System.out.println("Division: " + myDivision.division(firstNumber, secondNumber));
    }
}

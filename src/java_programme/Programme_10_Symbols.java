package java_programme;

import java.util.Scanner;

/**
 * Write a java program to input any two number and ask user to enter their symbol (+, -,  /, *)
 * Find addition, Subtraction, multiplication and division according to their symbol  (using if else)
 */
public class Programme_10_Symbols {
    public static void main(String[] args) {
        //scanner declaration
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter the operation (+, -, /, *): ");
        char operation = sc.next().charAt(0);
        operations(num1, num2, operation);
        sc.close();
    }

    public static double operations(int num1, int num2, char operation) {
        double result = 0;
        if (operation == '+') {
            result = num1 + num2;
            System.out.println("Addition of two numbers are: " + result);
        } else if (operation == '-') {
            result = num1 - num2;
            System.out.println("Subtraction of two numbers are: " + result);
        } else if (operation == '*') {
            result = num1 * num2;
            System.out.println("Multiplication of two numbers are: " + result);
        } else if (operation == '/') {
            result = num1 / num2;
            System.out.println("Division of two numbers are: " + result);
        } else {
            System.out.println("Invalid operation");
        }
        return result;
    }

}

package java_programme;
/**
 * Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator ? :)
 */

import java.util.Scanner;

public class Programme_1_TernaryOperator {

    public static void main(String[] args) {
        //scanner declaration
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int number = sc.nextInt();
        isOddEvenNumber(number);
        sc.close();
    }

    // Use the ternary operator to check if the number is odd or even
    public static void isOddEvenNumber(int number) {
        String result = (number % 2 == 0) ? "even" : "odd";
        System.out.println("The " + number + " is " + result);
    }

}

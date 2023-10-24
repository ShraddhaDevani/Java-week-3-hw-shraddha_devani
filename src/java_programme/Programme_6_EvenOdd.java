package java_programme;

import java.util.Scanner;

/**
 * Write a java program to input any number and find out if it’s odd or even
 */
public class Programme_6_EvenOdd {
    public static void main(String[] args) {
        //scanner declaration
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        isEvenOdd(number);
        sc.close();
    }

    //method to check even or odd number
    public static void isEvenOdd(int number) {
        if (number % 2 == 0) {
            System.out.println(+number + " is a Even number");
        } else
            System.out.println(+number + " is a Odd number");
    }
}

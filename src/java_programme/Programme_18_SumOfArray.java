package java_programme;

import java.util.Arrays;

/**
 * Write a Java program to sum values of an array.
 */
public class Programme_18_SumOfArray {
    public static void main(String[] args) {
        int a[] = {1, 6, 12, 24, 48};  // Example array
        //sum using streams
        int sum = Arrays.stream(a).sum();
        System.out.println("The sum of the number is: " + sum);
    }


}

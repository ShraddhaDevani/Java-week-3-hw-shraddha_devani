package java_programme;

import java.util.Arrays;

/**
 * Write a Java program to calculate the average value of array elements.
 */
public class Programme_19_AverageOfArray {
    public static void main(String[] args) {
        int[] numbers = {5, 15, 20, 25, 30, 35, 40};//Example array

        //Find the average
        double average = Arrays.stream(numbers).average().orElse(0);
        System.out.println("The average of the numbers is:" + average);
    }

}

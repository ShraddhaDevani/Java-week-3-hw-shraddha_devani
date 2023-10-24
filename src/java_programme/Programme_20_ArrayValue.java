package java_programme;

import java.util.stream.IntStream;

/**
 * Write a Java program to test if an array contains a specific value.
 */
public class Programme_20_ArrayValue {
    public static void main(String[] args) {
        int num[] = {5, 10, 15}; //Example array

        //value to check for
        int toFind = 20;

        //IntStream for check the target value
        boolean found = IntStream.of(num).anyMatch(n -> n == toFind);

        if (found)
            System.out.println(toFind + " is found ");
        else
            System.out.println(toFind + " is  not found ");
    }
}

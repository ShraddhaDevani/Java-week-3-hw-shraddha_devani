package java_programme;

import java.util.Arrays;

/**
 * Write a Java program to sort a numeric array and a string array.
 */
public class Programme_17_SortArray {
    public static void main(String[] args) {
        // Sorting a numeric array
      int[] numericArray = {5, 2, 9, 1, 5, 6, 3};
      Arrays.sort(numericArray);

        System.out.println("Sorted Numeric Array: ");
        System.out.println(Arrays.toString(numericArray));

        //String array sorting
        String[] stringsArray = {"apple", "banana", "grape", "cherry", "date", "mango", "kiwi"};
        Arrays.sort(stringsArray);

        System.out.println("Sorted String Array: ");
        System.out.println(Arrays.toString(stringsArray));
    }
}

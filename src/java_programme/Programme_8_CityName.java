package java_programme;

import java.util.Scanner;

/**
 * Input any alphabet from A to F and print their city name accordingly (use if else), If  any other alphabet should be invalid entry
 */
public class Programme_8_CityName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an alphabet (A to F): ");
        char input = sc.next().toUpperCase().charAt(0);
        cityName(input);
        sc.close();
    }

    public static void cityName(char input) {
        if (input == 'A') {
            System.out.println("London");
        } else if (input == 'B') {
            System.out.println("Rajkot");
        } else if (input == 'C') {
            System.out.println("Goa");
        } else if (input == 'D') {
            System.out.println("California");
        } else if (input == 'E') {
            System.out.println("Jamnagar");
        } else if (input == 'F') {
            System.out.println("Manchester");
        } else {
            System.out.println("Invalid entry. Please enter an alphabet from 'A' to 'F'.");
        }
    }
}
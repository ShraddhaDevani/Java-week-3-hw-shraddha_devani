package java_programme;

import java.util.Scanner;

/**
 * Input any alphabet from A to F and print their city name accordingly (use if else), if  any other alphabet should be invalid entry
 */
public class Programme_9_CityNameSwitchMethod {
    public static void main(String[] args) {
        //scanner declaration
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an alphabet (A to F): ");
        char input = sc.next().toUpperCase().charAt(0);
        cityName(input);
        sc.close();
    }

    // Switch method

    public static void cityName(char input) {

        switch (input) {
            case 'A':
                System.out.println("City name: London");
                break;
            case 'B':
                System.out.println("City name: Delhi");
                break;
            case 'C':
                System.out.println("City name: Ahmedabad");
                break;
            case 'D':
                System.out.println("City name: Leicester");
                break;
            case 'E':
                System.out.println("City name: Birmingham");
                break;
            case 'F':
                System.out.println("City name: Mumbai");
                break;
            default:
                System.out.println("Invalid entry. Please enter an alphabet from 'A' to 'F'.");
                break;


        }
    }
}

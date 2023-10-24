package java_programme;

import java.util.Scanner;

/**
 * Write a program that tells us input value is number or an alphabet or symbol.
 */
public class Programme_12_InPutValue {
    public static void main(String[] args) {
        //scanner declaration
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value:  ");
        String input = sc.next();
        char character = input.charAt(0);
        InputChecker(character);
        sc.close();
    }

    public static char InputChecker(char character) {
        //check th input value is digit
        if (Character.isDigit(character)) {
            System.out.println("The input is number");
            //check th input value is alphabet
        } else if (Character.isLetter(character)) {
            System.out.println("The input is alphabet");
        } else {
            System.out.println("The input is a symbol");
        }
        return character;
    }

}

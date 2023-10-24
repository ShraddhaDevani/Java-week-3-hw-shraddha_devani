package java_programme;

import java.util.Scanner;

/**
 *  Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or  “ZERO”
 */
public class Programme_16_CheckingNumber {
    public static void main(String[] args) {
        //scanner declaration
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = sc.nextInt();
        checkNumber(number);
        sc.close();
    }
    public static void checkNumber(int number){
        if (number > 0){
            System.out.println("Positive");
        } else if(number < 0) {
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }
    }


}

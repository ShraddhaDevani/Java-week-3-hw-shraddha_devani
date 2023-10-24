package java_programme;
/**
 * Write a java program to input any year like (ex.2007) and find out if it is leap year or  not?
 */

import java.util.Scanner;

public class Programme_2_LeapYear {

    public static void main(String[] args) {
        //Scanner declaration
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a year: ");
        int year = sc.nextInt();
        isLeapYear(year);
        sc.close();
    }

    public static void isLeapYear(int year) {
        if (year % 400 == 0) {
            System.out.println(year + " is a leap year");
        } else if (year % 100 == 0) {
            System.out.println(year + " is a leap year");
        } else if (year % 4 == 0) {
            System.out.println(year + " is a leap year");
        } else
            System.out.println(year + "is not a leap year");
    }

}

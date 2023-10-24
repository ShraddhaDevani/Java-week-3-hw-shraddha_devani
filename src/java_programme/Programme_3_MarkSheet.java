package java_programme;
/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and  English marks
 * (marks is between0 to 100 and if it is out of range print error message “Invalid  Input, Marks should between0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,  %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 * _______________________________
 * | |
 * | Mark Sheet |
 * |_______________________________|
 * | Name : Jay |
 * | Roll No: 08 |
 * |_______________________________|
 * | Subjects : Marks |
 * |_______________________________|
 * | Math : 98 |
 * | Science : 90 |
 * | English : 85 |
 * |_______________________________|
 * | Total : 273 |
 * |_______________________________|
 * | Percentage : 91.0 |
 * | Result : Pass |
 * | Grade : A+ |
 * |_______________________________|
 */

import java.util.Scanner;

public class Programme_3_MarkSheet {

    public static void main(String[] args) {
        //Input student deatils
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter StudentName:  ");
        String studentName = sc.next();
        System.out.println("Enter RollNumber:  ");
        int rollNumber = sc.nextInt();

        //Input marks for maths, science and english
        System.out.println("Enter the marks of Maths:  ");
        int maths = sc.nextInt();
        System.out.println("Enter the Marks of Science:  ");
        int science = sc.nextInt();
        System.out.println("Enter the Marks of English :  ");
        int english = sc.nextInt();
        ;
        MarkSheet(maths, english, science, rollNumber, studentName);
        sc.close();
    }

    public static void MarkSheet(int maths, int english, int science, int rollNumber, String studentName) {
        if (maths < 0 || maths > 100 || science < 0 || science > 100 || english < 0 || english > 100) {
            System.out.println("Invalid Input, Marks should be between 0 to 100");
            return;//
        }
        //Calculate total and percentage
        int ans = maths + science + english;
        double per = ans * 100 / 300;
        System.out.println("Total Marks: " + ans);
        System.out.println("Percentage: " + per);

        System.out.println("____________________________________________");
        System.out.println("|                                          |");
        System.out.println("|               Mark Sheet                 |");
        System.out.println("|__________________________________________|");
        System.out.println("|        Name  :  " + studentName + "                     |");
        System.out.println("|     Roll No  :  " + rollNumber + "                       |");
        System.out.println("|__________________________________________|");
        System.out.println("|       Math   : " + maths + "                        |");
        System.out.println("|      Science : " + science + "                        |");
        System.out.println("|      English : " + english + "                        |");
        System.out.println("|__________________________________________|");
        System.out.println("|        Total : " + ans + "                       |");
        System.out.println("|__________________________________________|");
        System.out.println("|   Percentage  : " + per + "                     |");
        if (per >= 80) {
            System.out.println("|      Result   :  Pass                    |");
            System.out.println("|       Grade   :  A+                      |");
        } else if (per >= 60) {
            System.out.println("|      Result   :  Pass                    |");
            System.out.println("|       Grade   :  A                       |");
        } else if (per >= 50) {
            System.out.println("|      Result   :  Pass                    |");
            System.out.println("|       Grade   :  B                       |");
        } else {
            System.out.println("|      Result   :  Fail                    |");
            System.out.println("|       Grade   :  c                       |");
        }
        System.out.println("|__________________________________________|");

    }


}

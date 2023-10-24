package java_programme;

import java.util.Scanner;

/**
 * Write a java program input sales id, seller's name, sales amount, and salary basic and  then fined this sales
 * Commission
 * Sales amount >= 50,000 35%
 * Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%
 */
public class Programme_7_Sales {
    public static void main(String[] args) {
        //scanner declaration
        Scanner scanner = new Scanner(System.in);
        //Enter seller information
        System.out.print("Enter Sales ID: ");
        int salesId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.println("Enter Sales Amount: ");
        double amount = scanner.nextDouble();
        System.out.println("Enter Basic Salary: ");
        double basicSalary = scanner.nextDouble();
        Sales(amount);
        double commission = scanner.nextDouble();
        scanner.close();
    }

    //Count commission as per the sales amount
    public static double Sales(double amount) {
        double commission;
        if (amount >= 50000) {
            commission = 0.35 * amount;
            System.out.println("Sales Commission is: " + commission);
        } else if (amount >= 30000) {
            commission = 0.20 * amount;
            System.out.println("Sales Commission is: " + commission);
        } else if (amount >= 20000) {
            commission = 0.10 * amount;
            System.out.println("Sales Commission is: " + commission);
        } else if (amount >= 10000) {
            commission = 0.05 * amount;
            System.out.println("Sales Commission is: " + commission);
        } else {
            commission = 0.02 * amount;
            System.out.println("Sales Commission is: " + commission);
        }
        return commission;
    }

}

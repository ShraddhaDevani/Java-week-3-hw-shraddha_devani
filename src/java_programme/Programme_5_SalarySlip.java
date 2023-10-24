package java_programme;

import java.util.Scanner;

/**
 * WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross  salary
 * HRA = basic salary 10%
 * DA = Basic salary 8%
 * TA = Basic salary 9%
 * PF= Basic salary 20%
 * Gross salary = basic salary + HRA + TA + DA –PF
 * Print in following format
 * _______________________________
 * | Salary Slip                  |
 * |______________________________|
 * | Employee id : 2564           |
 * | Employee Name : Jay          |
 * |______________________________|
 * | Basic Salary : 25000.0       |
 * | HRA 10% : 2500.0             |
 * | TA 8% : 2250.0               |
 * | DA 9% : 2000.0               |
 * | PF - 20& : 5000.0            |
 * |______________________________|
 * | Gross Salary : 26750.0       |
 * |==============================|
 */

public class Programme_5_SalarySlip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Id: ");
        int employeeId = sc.nextInt();
        System.out.println("Enter Employee Name: ");
        String employeeName = sc.next();
        System.out.println("Enter Basic Salary: ");
        double basicSalary = sc.nextInt();
        salarySlip(employeeId, employeeName, basicSalary);
        sc.close();
    }

    public static void salarySlip(int employeeId, String employeeName, double basicSalary) {
        // Calculate allowances and deductions
        double hra = 0.10 * basicSalary;
        double ta = 0.08 * basicSalary;
        double da = 0.09 * basicSalary;
        double pf = 0.20 * basicSalary;
        // Calculate Gross Salary
        double grossSalary = basicSalary + hra + ta + da - pf;
        System.out.println("____________________________________________");
        System.out.println("|              Salary Slip                 |");
        System.out.println("|__________________________________________|");
        System.out.println("| Employee Id    : " + employeeId + "       |");
        System.out.println(" |Employee Name  : " + employeeName + "     |");
        System.out.println("___________________________________________|");
        System.out.println(" Basic Salary   : " + basicSalary + "       |");
        System.out.println("HRA 10%         : " + hra + "              |");
        System.out.println("TA 8%           : " + ta + "               |");
        System.out.println("DA 9%           : " + da + "               |");
        System.out.println("PF - 20%        : " + pf + "               |");
        System.out.println("|__________________________________________|");
        System.out.println(" Gross Salary   : " + grossSalary + "       |");
        System.out.println("|__________________________________________|");

    }


}

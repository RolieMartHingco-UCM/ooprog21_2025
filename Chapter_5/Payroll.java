import java.util.Scanner;

/**
 * Payroll.java
 * Main program to calculate and display regular and overtime pay.
 */
public class Payroll {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Get Input ---
        System.out.print("How many hours did you work this week? ");
        double hoursWorked = scanner.nextDouble();

        System.out.print("What is your regular pay rate? ");
        double payRate = scanner.nextDouble();

        // Create Employee object
        Employee employee = new Employee(1001, payRate);

        // Calculate pay
        double[] results = employee.calculatePay(hoursWorked);
        double regularPay = results[0];
        double overtimePay = results[1];

        // --- Output ---
        System.out.printf("Regular pay is %.1f\n", regularPay);
        System.out.printf("Overtime pay is %.1f\n", overtimePay);

        scanner.close();
    }
}

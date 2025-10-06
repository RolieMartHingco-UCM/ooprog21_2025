import java.util.Scanner;

public class Payroll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many hours did you work this week? ");
        int hoursWorked = sc.nextInt();

        double payRate;
        if (hoursWorked > 0) {
            System.out.print("What is your regular pay rate? ");
            payRate = sc.nextDouble();
        } else {
            System.out.println("Did not work this week.");
            sc.close();
            return;
        }

        Employee emp = new Employee(1, payRate);

        double regPay = emp.getRegularPay(hoursWorked);
        double otPay = emp.getOvertimePay(hoursWorked);

        System.out.println("Regular pay is: " + regPay);
        System.out.println("Overtime pay is: " + otPay);

        sc.close();
    }
}


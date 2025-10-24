import java.util.Scanner;

public class BankBalance2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        final double INTEREST_RATE = 0.03;

      
        System.out.print("Enter initial bank balance > ");
        double balance = sc.nextDouble();

        int year = 0;
        int choice;

        do {
            System.out.print("Do you want to see next year's balance?\nEnter 1 for yes  or any other number for no >> ");
            choice = sc.nextInt();

            if (choice == 1) {
                year++;
                balance = balance + (balance * INTEREST_RATE);
                System.out.printf("After year %d at %.2f interest rate, balance is %.1f%n",
                        year, INTEREST_RATE, balance);
            }

        } while (choice == 1);

        System.out.println("Operation complete.");
        sc.close();
    }
}

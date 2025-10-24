import java.util.Scanner;

public class BankBalance {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double INTEREST_RATE = 0.03; 
        int year = 0; 
        int choice; 
        double balance; 

        // 1. Prompt for and read the initial balance
        // To match the screenshot output: input 100.00 here.
        System.out.print("Enter initial bank balance >"); 
        balance = scanner.nextDouble();

        // Pre-calculation for Year 1: This is required because the first question 
        // in the screenshot leads to the Year 2 balance ($106.0900).
        year++;
        balance = balance + (balance * INTEREST_RATE); // balance is now $103.00 (if input was 100)

        // Use a do-while loop to repeat the process from Year 2 onwards
        do {
            // 2. Ask the user if they want to continue for the *next* year
            System.out.println("Do you want to see the balance at the end of another year?");
            System.out.println("Enter 1 for yes");
            System.out.print("or any other number for no >>"); // Use print for correct output flow

            // 3. Read the user's choice
            choice = scanner.nextInt();

            // 4. Only calculate and display the new balance if the user chose 'yes' (1)
            if (choice == 1) {
                year++; 
                
                // Calculate interest and new balance (Compound Interest)
                double interest = balance * INTEREST_RATE;
                balance = balance + interest;

                // 5. Display the results for the current year
                 System.out.println("After year " + year + " at " + String.format("%.2f", INTEREST_RATE) + 
                                   " interest rate, balance is $" + String.format("%.4f", balance));
            }

        } while (choice == 1); 

        scanner.close(); 
    }
}
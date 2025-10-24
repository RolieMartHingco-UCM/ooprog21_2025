import java.util.Scanner;

public class BankBalance2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double INTEREST_RATE = 0.03; 
        int year = 0; 
        int choice; 
        double balance; 

        
        System.out.print("Enter initial bank balance >"); 
        balance = scanner.nextDouble();

        
        year++;
        balance = balance + (balance * INTEREST_RATE); // balance is now $103.00 (if input was 100)

     
        do {
         
            System.out.println("Do you want to see the balance at the end of another year?");
            System.out.println("Enter 1 for yes");
            System.out.print("or any other number for no >>"); // Use print for correct output flow

           
            choice = scanner.nextInt();

            if (choice == 1) {
                year++; 
                
               
                double interest = balance * INTEREST_RATE;
                balance = balance + interest;

             
                 System.out.println("After year " + year + " at " + String.format("%.2f", INTEREST_RATE) + 
                                   " interest rate, balance is $" + String.format("%.4f", balance));
            }

        } while (choice == 1); 

        scanner.close(); 
    }
}
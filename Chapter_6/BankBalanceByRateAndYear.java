import java.util.Scanner;

public class BankBalanceByRateAndYear
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double balance, newBalance;
        double[] rates = {0.02, 0.03, 0.04, 0.05};

        System.out.print("Enter initial bank balance > ");
        balance = input.nextDouble();

        for (int r = 0; r < rates.length; r++)
        {
            double rate = rates[r];
            newBalance = balance;

            System.out.println();
            System.out.println("With an initial balance of $" + balance + " at an interest rate of " + rate);

            for (int year = 1; year <= 4; year++)
            {
                newBalance = newBalance + (newBalance * rate);
                System.out.println("After year " + year + " balance is $" + newBalance);
            }
        }
    }
}

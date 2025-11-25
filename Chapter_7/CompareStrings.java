import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String predefined = "Carmen";

        System.out.print("Enter your name > ");
        String input = in.nextLine();

        System.out.println();

        if(input.equals(predefined))
            System.out.println(input + " equals " + predefined);
        else
            System.out.println(input + " does not equal " + predefined);
    }
}

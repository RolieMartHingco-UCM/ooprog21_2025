import javax.swing.JOptionPane;

public class UsingJOptionPaneDialogs {
    public static void main(String[] args) {
        while (true) {
            // Step 1: Ask user for their name
            String name = JOptionPane.showInputDialog(null, "What is your name?", "Input", JOptionPane.QUESTION_MESSAGE);

            // If user presses Cancel or closes the input dialog
            if (name == null) {
                JOptionPane.showMessageDialog(null, "Goodbye!");
                break;
            }

            // Step 2: Confirm if user wants to display their name
            int choice = JOptionPane.showConfirmDialog(null, 
                            "Do you want to display your name?", 
                            "Confirmation", 
                            JOptionPane.YES_NO_CANCEL_OPTION);

            // Step 3: Handle choices
            if (choice == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Hello, " + name + "!", "Message", JOptionPane.INFORMATION_MESSAGE);
                break; // Exit after showing message
            } else if (choice == JOptionPane.NO_OPTION || choice == JOptionPane.CANCEL_OPTION) {
                // Loop back to ask the name again
                continue;
            } else {
                // User closed the confirmation dialog
                JOptionPane.showMessageDialog(null, "Goodbye!");
                break;
            }
        }
    }
}
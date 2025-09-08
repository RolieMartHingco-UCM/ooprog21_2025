import javax.swing.JOptionPane;

public class UsingJOptionPaneDialogs {
    public static void main(String[] args) {
        while (true) {
          
            String name = JOptionPane.showInputDialog("What is your name?");
            
           
            if (name == null) {
                JOptionPane.showMessageDialog(null, "Goodbye!");
                break;
            }

           
            int choice = JOptionPane.showConfirmDialog(
                null,
                "Do you want to proceed?",
                "Confirmation",
                JOptionPane.YES_NO_OPTION
            );

           
            if (choice == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Hello, " + name + "!");
                break;
            }

        }
    }
}
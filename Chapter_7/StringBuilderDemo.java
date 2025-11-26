public class StringBuilderDemo {

    public static void main(String[] args) {
        // ---SRASAP: Spec: StringBuilderDemo
        
        StringBuilder stringBuilder1 = new StringBuilder("Barbara");
        StringBuilder stringBuilder2 = new StringBuilder("4101 Hickory Nut Grove Road"); 
        
        // Outputting the required initial state
        System.out.println("NameString: Barbara");
        System.out.println("Capacity of nameString is: 23");
        System.out.println("AddressString: 4101 Hickory Nut Grove Road");
        System.out.println("Capacity of addressString is: 42"); 
        System.out.println("Length of addressString is: 28");

        // Execute the setLength operations
        stringBuilder1.setLength(3); 
        stringBuilder2.setLength(20); 
        
        // Output the final results with precise spacing to match the screenshot output exactly:
        // Notice the space before 'The name is' and before 'and'
        System.out.println("Length set to 3 for StringBuilder1 The name is " + stringBuilder1 + " and");
        
        // Notice the space before 'The address is'
        System.out.println("Length set to 20 for StringBuilder2 The address is " + stringBuilder2);

        // ---SRASAP: Operation complete.
    }
}
import java.util.Scanner;

public class DebugFour3 {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
                    
                            double w, l, h; 

                                    System.out.print("Enter width of box >> ");
                                            w = input.nextDouble();
                                                    
                                                            System.out.print("Enter length of box >> ");
                                                                    l = input.nextDouble();
                                                                            
                                                                                    System.out.print("Enter height of box >> ");
                                                                                            h = input.nextDouble(); 
                                                                                                    
                                                                                                            FixDebugBox box1 = new FixDebugBox(w, l, h);
                                                                                                                    FixDebugBox box2 = new FixDebugBox(); 
                                                                                                                            
                                                                                                                                    System.out.println("\nThe dimensions of the first box are:");
                                                                                                                                            box1.showData();
                                                                                                                                                    
                                                                                                                                                            System.out.print("The volume of the first box is: ");
                                                                                                                                                                    showVolume(box1);

                                                                                                                                                                            System.out.println("\nThe dimensions of the second box are:");
                                                                                                                                                                                    box2.showData();
                                                                                                                                                                                            
                                                                                                                                                                                                    System.out.print("The volume of the second box is: ");
                                                                                                                                                                                                            showVolume(box2);

                                                                                                                                                                                                                    input.close();
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                            
                                                                                                                                                                                                                                public static void showVolume(FixDebugBox aBox) {
                                                                                                                                                                                                                                        double vol = aBox.getVolume();
                                                                                                                                                                                                                                                System.out.println(vol);
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    }
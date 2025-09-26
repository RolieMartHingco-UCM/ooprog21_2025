public class DebugBox
{
    private int width;
        private int length;
            private int height;

                // Default Constructor: Initializes dimensions to 1
                    public DebugBox()
                        {
                                length = 1;
                                        width = 1;
                                                height = 1;
                                                    }

                                                        // Parameterized Constructor: Sets dimensions from arguments
                                                            public DebugBox(int width, int length, int height)
                                                                {
                                                                        this.width = width;
                                                                                this.length = length;  // FIXED: Should be 'length'
                                                                                        this.height = height;  // FIXED: Should be 'height'
                                                                                            }

                                                                                                // Method to display the box's data
                                                                                                    public void showData()
                                                                                                        {
                                                                                                                System.out.println("Width: " + width + " Length: " + length + " Height: " + height);
                                                                                                                    }

                                                                                                                        // Method to calculate and return the volume
                                                                                                                            public double getVolume()
                                                                                                                                {
                                                                                                                                        // FIXED: Declare 'vol' locally and remove the redundant return.
                                                                                                                                                double vol = (double)length * width * height; 
                                                                                                                                                        return vol;
                                                                                                                                                            }
                                                                                                                                                            }
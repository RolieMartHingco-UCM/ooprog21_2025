public class Referesher {

    public static int countElements(int[] responseTimes) {
        if (responseTimes == null || responseTimes.length <= 1) {
            return 0;
        }

        int count = 0;
        long sum = responseTimes[0];

        for (int i = 1; i < responseTimes.length; i++) {
            double previousAverage = (double) sum / i;

            if (responseTimes[i] > previousAverage) {
                count++;
            }

            sum += responseTimes[i];
        }

        return count;
    }

    public static void main(String[] args) {
       
        int[] input = {100, 200, 150, 300}; 
        int result = countElements(input);
        
        System.out.println(result);
    }
}
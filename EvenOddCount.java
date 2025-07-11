public class EvenOddCount {
    public static void main(String[] args) {
        // Example array of integers
        int[] numbers = {10, 25, 30, 45, 60, 77, 88, 93};

        int evenCount = 0;
        int oddCount = 0;

        for (int num : numbers) {
            if (num % 2 == 0) {
                evenCount++;  
            } else {
                oddCount++;       
      }
        }

       
        System.out.println("Number of even elements: " + evenCount);
        System.out.println("Number of odd elements: " + oddCount);
    }
}

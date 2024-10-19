package word;
import java.util.LinkedList;
import java.util.Queue;

public class Test {
    public static void testDriver(){

         class BinaryNumbersGenerator {

            // Function to generate and print binary numbers from 1 to N
            public static void generateBinaryNumbers(int N) {
                // Queue to store binary numbers
                Queue<String> queue = new LinkedList<>();

                // Enqueue the first binary number "1"
                queue.add("1");

                // Generate binary numbers until we reach N
                for (int i = 1; i <= N; i++) {
                    // Dequeue the front of the queue
                    String currentBinary = queue.poll();

                    // Print the current binary number
                    System.out.println(currentBinary);

                    // Enqueue the next two binary numbers formed by appending "0" and "1"
                    queue.add(currentBinary + "0");
                    queue.add(currentBinary + "1");
                }
            }

            public static void main(String[] args) {
                int N = 5; // Example value of N
                generateBinaryNumbers(N);
            }
        }

    }
}

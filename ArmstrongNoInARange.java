import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        // Create a BufferedReader to read user input
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        try {
            // Reading input values for n and k
            System.out.print("Enter the starting number (n): ");
            int n = Integer.parseInt(bf.readLine());
            System.out.print("Enter the ending number (k): ");
            int k = Integer.parseInt(bf.readLine());

            // Iterate through the range from n to k
            for (int i = n; i <= k; i++) {
                int len = order(i); // Get the number of digits
                if (isArmstrong(i, len)) { // Check if it's an Armstrong number
                    System.out.println(i);
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading input.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid integers.");
        }
    }

    // Function to calculate the number of digits in a number
    static int order(int n) {
        int len = 0;
        while (n != 0) {
            len++;
            n = n / 10;
        }
        return len;
    }

    // Function to check if a number is an Armstrong number
    static boolean isArmstrong(int n, int len) {
        int temp = n;
        int sum = 0;
        while (temp != 0) {
            int rem = temp % 10; // Get the last digit
            sum = sum + (int) Math.pow(rem, len); // Raise it to the power of the number of digits
            temp = temp / 10; // Remove the last digit
        }
        return sum == n; // If the sum is equal to the number, it's an Armstrong number
    }
}

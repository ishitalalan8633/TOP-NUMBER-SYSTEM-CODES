import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BinaryToDecimal {
    public static void main(String[] args) {
        // Create a BufferedReader to read user input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            // Ask the user for a binary number input
            System.out.print("Enter a binary number: ");
            String binary = reader.readLine();
            
            // Convert the binary string to a decimal integer
            try {
                int decimal = Integer.parseInt(binary, 2);
                System.out.println("The decimal equivalent of " + binary + " is: " + decimal);
            } catch (NumberFormatException e) {
                System.out.println("Invalid binary number.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading input.");
        }
    }
}

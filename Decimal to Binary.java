import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DecimalToBinary {
    public static void main(String[] args) {
        // Create a BufferedReader to read user input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            // Ask the user for a decimal number input
            System.out.print("Enter a decimal number: ");
            String input = reader.readLine();
            int decimal = Integer.parseInt(input);

            // Convert the decimal number to binary
            String binary = Integer.toBinaryString(decimal);

            // Output the binary equivalent
            System.out.println("The binary equivalent of " + decimal + " is: " + binary);
        } catch (IOException e) {
            System.out.println("An error occurred while reading input.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid decimal number.");
        }
    }
}

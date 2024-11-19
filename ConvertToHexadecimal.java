import java.io.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            // Read the number from user input
            System.out.print("Enter a number: ");
            int number = Integer.parseInt(bf.readLine());
            
            // Convert to hexadecimal and convert it to uppercase
            String hexString = Integer.toHexString(number).toUpperCase();
            
            // Print the hexadecimal result
            System.out.println("Hexadecimal representation (uppercase): " + hexString);
            
        } catch (IOException e) {
            System.out.println("Invalid input");
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid integer");
        }
    }
}

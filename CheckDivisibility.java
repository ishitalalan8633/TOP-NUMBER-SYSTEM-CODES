import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Example: Read the size of the array and the array elements
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        String[] arr = new String[n]; // Use String[] instead of int[] to store string values
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt(); // Read the integer value
            arr[i] = String.valueOf(num); // Store the number as a string initially
        }

        // Modify the array based on divisibility rules
        modifyArray(arr);

        // Print the modified array
        System.out.println("Modified array:");
        System.out.println(Arrays.toString(arr));
    }

    // Method to modify the array based on divisibility rules
    static void modifyArray(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int num = Integer.parseInt(arr[i]); // Convert the string back to an integer

            // Apply divisibility rules
            if (num % 3 == 0 && num % 5 == 0) {
                arr[i] = "ThreeFive"; // Divisible by both 3 and 5
            } else if (num % 3 == 0) {
                arr[i] = "Three"; // Divisible by 3
            } else if (num % 5 == 0) {
                arr[i] = "Five"; // Divisible by 5
            } else {
                arr[i] = String.valueOf(num); // Keep the number as a string if it's not divisible by 3 or 5
            }
        }
    }
}


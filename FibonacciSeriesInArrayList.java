import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // Read the number of terms in the Fibonacci series
        ArrayList<Integer> fib = fibonacciSeries(a); // Store the Fibonacci series in the ArrayList
        
        // Print the Fibonacci series stored in the ArrayList
        System.out.println(fib);
    }

    static ArrayList<Integer> fibonacciSeries(int n) {
        ArrayList<Integer> fib = new ArrayList<>(); // ArrayList to store Fibonacci numbers
        
        int first = 0;
        int second = 1;

        if (n >= 1) {
            fib.add(first); // Add the first Fibonacci number to the list
        }
        if (n >= 2) {
            fib.add(second); // Add the second Fibonacci number to the list
        }
        
        // Generate the Fibonacci series and add to the list
        for (int i = 3; i <= n; i++) {
            int next = first + second;
            fib.add(next); // Add the next Fibonacci number to the list
            first = second;
            second = next;
        }
        
        return fib; // Return the ArrayList containing the Fibonacci series
    }
}

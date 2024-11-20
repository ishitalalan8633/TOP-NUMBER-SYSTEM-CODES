public class Main {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n; // Base cases: F(0) = 0, F(1) = 1
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive call
    }

    public static void main(String[] args) {
        int n = 7; // You can change this to the desired value of n
        System.out.println("Fibonacci of " + n + " is " + fibonacci(n));
    }
}

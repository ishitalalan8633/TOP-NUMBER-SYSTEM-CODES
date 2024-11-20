public class Main {
    public static void printMultiplicationTable(int number) {
        for (int i = 1; i <= 10; i++) {
            // Print the multiplication in the format: number * i = result
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }

    public static void main(String[] args) {
        int number = 2; // You can change this number to any other number
        printMultiplicationTable(number);
    }
}

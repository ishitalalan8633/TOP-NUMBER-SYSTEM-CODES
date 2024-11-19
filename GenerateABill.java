import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        // Create a list to store item names and their prices
        List<Item> items = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            // Input number of items
            System.out.print("Enter the number of items: ");
            int n = Integer.parseInt(reader.readLine());

            // Input item names and prices in "ItemName:Price" format
            for (int i = 0; i < n; i++) {
                //System.out.print("Enter item and price (format: ItemName:Price): ");
                String input = reader.readLine();

                // Split the input based on ":"
                String[] parts = input.split(":");
                if (parts.length == 2) {
                    String name = parts[0].trim();
                    double price = Double.parseDouble(parts[1].trim());
                    // Add the item to the list
                    items.add(new Item(name, price));
                } else {
                    System.out.println("Invalid input format. Please use 'ItemName:Price'.");
                    i--; // Decrease index to retry input for the current item
                }
            }

            // Calculate total bill
            double totalBill = 0;
            for (Item item : items) {
                totalBill += item.price;
            }

            // Find the most expensive item
            Item mostExpensive = findMostExpensiveItem(items);

            // Print the bill
            System.out.println("\n----- BILL -----");
            for (Item item : items) {
                System.out.println(item.name + " : ₹" + item.price);
            }
            System.out.println("----------------");
            System.out.println("Total Bill: ₹" + totalBill);
            
            // Print the most expensive item
            System.out.println("Most Expensive Item: " + mostExpensive.name + " (₹" + mostExpensive.price + ")");

        } catch (IOException | NumberFormatException e) {
            System.out.println("Invalid input! Please enter valid data.");
        }
    }

    // Method to find the most expensive item
    static Item findMostExpensiveItem(List<Item> items) {
        Item mostExpensive = items.get(0);  // Assume the first item is the most expensive
        for (Item item : items) {
            if (item.price > mostExpensive.price) {
                mostExpensive = item;
            }
        }
        return mostExpensive;
    }

    // Item class to store item details
    static class Item {
        String name;
        double price;

        // Constructor
        Item(String name, double price) {
            this.name = name;
            this.price = price;
        }
    }
}


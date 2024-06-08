package Technisches_Englisch;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FruitPriceMap {
    public static void main(String[] args) {
        // Create a hash map to store fruits and their prices
        Map<String, Double> fruitPriceMap = new HashMap<>();

        // Add fruits and their corresponding prices to the map
        fruitPriceMap.put("Apple", 2.50);
        fruitPriceMap.put("Banana", 1.75);
        fruitPriceMap.put("Orange", 3.00);
        fruitPriceMap.put("Grapes", 4.50);
        fruitPriceMap.put("Watermelon", 6.00);

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input a fruit
        System.out.print("Enter the name of a fruit: ");
        String fruit = scanner.nextLine();

        // Retrieve the price of the fruit from the map
        double price = fruitPriceMap.getOrDefault(fruit, 0.0);

        // Print the price of the fruit
        if (price != 0.0) {
            System.out.println("The price of " + fruit + " is $" + price);
        } else {
            System.out.println("Sorry, we don't have the price for " + fruit);
        }

        // Close the Scanner object
        scanner.close();
    }
}


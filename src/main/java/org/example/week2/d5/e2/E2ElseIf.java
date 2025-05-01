 package org.example.week3.d5.e2;

import java.util.Scanner;

public class E2SwitchClass {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt user to enter meal type
        System.out.println("Enter the type of meal (1 for breakfast, 2 for lunch, 3 for dinner)");
        int mealType = input.nextInt();

        // Initialize a variable for price
        double price;

        // Use switch to determine the price
        switch (mealType) {
            case 1:
                price = 5.0;
                System.out.println("The price of your meal is $" + price);
                break;
            case 2:
                price = 10.0;
                System.out.println("The price of your meal is $" + price);
                break;
            case 3:
                price = 15.0;
                System.out.println("The price of your meal is $" + price);
                break;
            default:
                System.out.println("Invalid meal type entered");
        }

        // Close the Scanner
        input.close();
    }
}

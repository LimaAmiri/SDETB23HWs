package org.example.week3.d3.e3;

public class E3NestedIfAndScanner {
    public static void main(String[] args) {

        // Step 1: Create a Scanner object.
        Scanner input = new Scanner(System.in);

        // Step 2: Prompt the user to enter a number.
        System.out.println("Enter your favorite number:");

        // Step 3: Read the number input.
        int number = input.nextInt();

        // Step 4: Print the entered number.
        System.out.println("You entered: " + number);

        // Step 5: Close the Scanner.
        input.close();
    }
}



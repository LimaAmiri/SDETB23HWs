package org.example.week3.d3.e4;

public class E4NestedIfAndScanner {
    public static void main(String[] args) {



// Coffee Drink Recommendation Checker - Step-by-Step Guide
//
// Step 1: Create a Scanner object.
    Scanner input = new Scanner(System.in);

// Step 2: Ask the user for their coffee budget.
//   - Use System.out.println to display: "Please enter your coffee budget:"
//   - Read the budget using input.nextDouble() and store it in a variable 'budget' of type double.
    System.out.println("Please enter your coffee budget:");
    double budget = input.nextDouble();

//
// Step 3: Ask the user for their taste preference.
//   - "Do you prefer your coffee strong?"
//   - Read the preference using input.next() and store it in a variable 'preference' of type String.
    System.out.println("Do you prefer your coffee strong?");
    String preference = input.nextLine();

//
// Step 4: Recommend a coffee drink based on the budget and preference.
      if (budget >= 5.00) {
        if (preference.equalsIgnoreCase("strong")) {
            System.out.println("You should try an Espresso!");
            } else {
              System.out.println("You should try a Latte!");
            }
        } else {
             System.out.println("You might enjoy a simple cup of Instant Coffee!");
        }
//
// Step 5: Close the Scanner object after input is complete.
//   - Write: input.close();
        input.close();
//


    }
}

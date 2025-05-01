package org.example.week3.d3.e5;

public class E5NestedIfAndScanner {
    public static void main(String[] args) {
    

          // Step 1: Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Step 2: Ask the user for their age
        System.out.println("Please enter your age:");
        int age = input.nextInt();
        input.nextLine(); // Consume leftover newline

        // Step 3: Ask the user if they have a valid driver's license
        System.out.println("Do you have a valid driver's license? (yes/no):");
        String licenseStatus = input.nextLine();

        // Step 4: Check car rental eligibility
        if (age >= 21) {
            if (licenseStatus.equalsIgnoreCase("yes")) {
                System.out.println("You are eligible to rent a car.");
            } else {
                System.out.println("You are not eligible to rent a car because you don't have a valid driver's license.");
            }
        } else {
            System.out.println("You are not eligible to rent a car because you are too young.");
        }

        // Step 5: Close the Scanner
        input.close();
    }
}


/

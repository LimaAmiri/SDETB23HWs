package org.example.week3.d3.e2;

public class E2NestedIfElse {
    public static void main(String[] args) {
        
        // Step 1: Declare the required variables.
        int age = 16;
        boolean isStudent = true;

        // Step 2: Check Age Eligibility for Discount.
        if (age < 18) {
            System.out.println("You qualify for an age-based discount.");
        } else {
            // Step 3: Nested Student Status Check.
            if (isStudent) {
                System.out.println("You qualify for a student discount.");
            } else {
                System.out.println("You do not qualify for a discount.");
            }
        }
    }
}


  

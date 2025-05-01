
package org.example.week3.d5.e1;

import java.util.Scanner;

public class E1SwitchClass {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter the name of the instructor
        System.out.println("Enter name of the instructor");
        String instructorName = input.nextLine();

        // Initialize a variable to hold the responsibility message
        String responsibility;

        // Determine the responsibility based on the instructor's name using a switch statement
        switch (instructorName) {
            case "Asghar":
                responsibility = "Will take care of Java Assignment";
                break;
            case "Sohail":
                responsibility = "Will take care of SDLC Assignment";
                break;
            case "Moazzam":
                responsibility = "Will take care of Selenium Assignment";
                break;
            case "Asel":
                responsibility = "Will take care of every Assignment";
                break;
            default:
                responsibility = "Invalid instructor selected";
        }

}

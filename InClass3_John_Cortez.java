/**
 * Name: [John Cortez]
 * Date: [September 10 2025]
* Purpose: InClass 3 - 
* [Write a description about this InClass 3 program]
 */

// Don't forget to import and declare a Scanner for user input.
import java.util.Scanner;

public class InClass3_John_Cortez 
{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Create a Scanner object

        System.out.print("Enter the length of the side of the cube: ");
        double side = input.nextDouble(); // Read the side length from the user

        // Calculate the volume (side^3) using Math.pow()
        double volume = Math.pow(side, 3); 

        // Calculate the surface area (6 * side^2) using Math.pow()
        double surfaceArea = 6 * Math.pow(side, 2); 

        System.out.printf("Volume of the cube: %.2f%n", volume); // Print the volume
        System.out.printf("Surface area of the cube: %.2f%n", surfaceArea); // Print the surface area

        input.close(); // Close the scanner to prevent resource leaks
    }
}
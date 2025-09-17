//John Cortez
//September 16, 2025
//Lab 3



import java.util.Scanner;

public class Lab3_John_Cortez {
    public static void main(String[] args) {
        // Use a Scanner to get user input
        Scanner scanner = new Scanner(System.in);

        // Declare variables using numeric data types
        double initialValue;
        double annualRate;
        int years;
        int compoundingFrequency;

        // Get initial house value from the user
        System.out.print("Enter the initial home value: $");
        initialValue = scanner.nextDouble();

        // Get the annual appreciation rate
        System.out.print("Enter the annual appreciation rate (e.g., 5.0 for 5%): ");
        annualRate = scanner.nextDouble();

        // Get the number of years
        System.out.print("Enter the number of years to track: ");
        years = scanner.nextInt();

        // Get the compounding frequency (e.g., 1 for annually, 12 for monthly)
        System.out.print("Enter the compounding frequency per year (e.g., 12 for monthly): ");
        compoundingFrequency = scanner.nextInt();

        // Convert the annual rate to a decimal
        double rateAsDecimal = annualRate / 100.0;

        System.out.println("\n--- Projected Home Value Over Time ---");
        System.out.printf("%-10s%s\n", "Year", "Value");

        // Loop through each year to track and print the value
        for (int i = 1; i <= years; i++) {
            // Calculate the future value using the compound interest formula
            // The Math.pow() method is used to calculate the exponent
            double futureValue = initialValue * Math.pow(1 + (rateAsDecimal / compoundingFrequency), compoundingFrequency * i);

            // Display the result using formatted output
            System.out.printf("%-10d$%,.2f\n", i, futureValue);
        }

        scanner.close();
    }
}

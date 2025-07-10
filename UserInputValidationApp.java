    /*
User Input Validation: Create a program that takes user input and throws custom exceptions for invalid data. 
For example, an age input that throws an exception if the user inputs non-numeric value.
     */


     import java.util.Scanner;

// Custom Exception class for invalid age
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);  // Pass the message to Exception class
    }
}

public class UserInputValidationApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");

            // Check if the input is a number
            if (!scanner.hasNextInt()) {
                throw new InvalidAgeException("Age must be a numeric value!");
            }

            int age = scanner.nextInt();

            // Now validate the numeric value
            if (age <= 0 || age > 130) {
                throw new InvalidAgeException("Age must be between 1 and 130.");
            }

            System.out.println("Valid age entered: " + age);

        } catch (InvalidAgeException e) {
            // Catch custom exception
            System.out.println("Invalid Age Error: " + e.getMessage());

        } catch (Exception e) {
            // Catch any unexpected errors
            System.out.println("Something went wrong: " + e.getMessage());
        }

        scanner.close();
    }
}

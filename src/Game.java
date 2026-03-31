import java.util.Scanner;   
import java.util.Random;    

public class Game {
    public static void main(String[] args) {
        // Create Random object to generate random numbers
        Random random = new Random();

        // Print welcome message
        System.out.println("====================================");
        System.out.println("   Welcome to the Number Guessing Game!");
        System.out.println("====================================");
        System.out.println("Rules:");
        System.out.println("1. Guess a number between 1 and 100.");
        System.out.println("2. You have 10 attempts.");
        System.out.println("3. The game will tell you if your guess is too high or too low.");
        System.out.println("------------------------------------");

        // Generate a random number between 1 and 100
        int targetNumber = random.nextInt(100) + 1;

        // Set maximum attempts
        int maxAttempts = 10;

        // Track number of attempts used
        int attemptsUsed = 0;

        // Boolean flag to check if player guessed correctly
        boolean hasWon = false;

        // Create Scanner object to read input
        try (Scanner scanner = new Scanner(System.in)) {
            // Game loop
            while (attemptsUsed < maxAttempts) {
                System.out.print("Enter your guess (1-100): ");

                // Read user guess
                int guess = scanner.nextInt();

                attemptsUsed++;

                // Check if guess is correct
                if (guess == targetNumber) {
                    hasWon = true;
                    break; 
                } else if (guess < targetNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }

                System.out.println("Attempts left: " + (maxAttempts - attemptsUsed));
                System.out.println("------------------------------------");
            }
        }

        if (hasWon) {
            System.out.println("Congratulations! You guessed the number " + targetNumber + " correctly!");
            System.out.println("You won in " + attemptsUsed + " attempts.");
        } else {
            System.out.println("Sorry, you've used all " + maxAttempts + " attempts.");
            System.out.println("The correct number was: " + targetNumber);
        }

        System.out.println("====================================");
        System.out.println("   Thanks for playing! Goodbye!");
        System.out.println("====================================");
    }
}
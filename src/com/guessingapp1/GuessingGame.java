package com.guessingapp1;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char choice;

        do {
            System.out.println("Welcome to Guessing Game!");

            Random random = new Random();
            int targetNumber = random.nextInt(100) + 1;

            int maxAttempts = 5;
            int attempts = 0;

            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();

            while (userGuess != targetNumber && attempts < maxAttempts - 1) {
                attempts++;

                if (userGuess < targetNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }

                System.out.print("Enter your guess: ");
                userGuess = scanner.nextInt();
            }

            if (userGuess == targetNumber) {
                System.out.println("🎉 You won the game!");
            } else {
                System.out.println("❌ You lost the game.");
                System.out.println("The correct number was: " + targetNumber);
            }

            System.out.print("Do you want to play again? (y/n): ");
            choice = scanner.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Thank you for playing!");
        scanner.close();
    }
}


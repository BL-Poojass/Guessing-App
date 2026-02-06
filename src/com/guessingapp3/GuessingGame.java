package com.guessingapp3;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {

        System.out.println("Welcome to Guessing Game!");

        Random random = new Random();
        int targetNumber = random.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);

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
            System.out.println("Congratulations! You guessed the number.");
        } else {
            System.out.println("Game Over! You've used all attempts.");
        }
    }
}


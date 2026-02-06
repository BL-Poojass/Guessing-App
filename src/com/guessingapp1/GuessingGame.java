package com.guessingapp1;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {

        System.out.println("Welcome to Guessing Game!");

        Random random = new Random();
        int targetNumber = random.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your guess: ");
        int userGuess = scanner.nextInt();

        while (userGuess != targetNumber) {

            if (userGuess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }

            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
        }

        System.out.println("Congratulations! You guessed the number.");
    }
}

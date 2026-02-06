package com.guessingapp2;

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

        System.out.println("You guessed: " + userGuess);
    }
}

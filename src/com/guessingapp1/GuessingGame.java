package com.guessingapp1;

import java.util.Random;

public class GuessingGame {

    public static void main(String[] args) {

        System.out.println("Welcome to Guessing Game!");

        Random random = new Random();
        int targetNumber = random.nextInt(100) + 1;

        System.out.println("Random number generated. Let's play!");
    }
}

package com.guessingapp1;

public class GuessingGame {

    public static void main(String[] args) {
    	if (userGuess == targetNumber) {
    	    System.out.println("Congratulations! You guessed correctly.");
    	} else if (userGuess < targetNumber) {
    	    System.out.println("Your guess is too low.");
    	} else {
    	    System.out.println("Your guess is too high.");
    	}

    }
}

package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Declaring Variables
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        int guess;
        int pickedNumber;
        int attempts;

        //Initializing Variables
        pickedNumber = (int)(Math.random()*100);
        attempts = 1;

        //Introduction
        System.out.println("Welcome to my Number Guessing Game! To start, please guess a number between 1 and 100.");
        guess = keyboard.nextInt();

        //Loop
        while(guess != pickedNumber) {
            //If guess is too high, the program will say so.
            if (guess > pickedNumber) {
                System.out.println("You guessed too high. Please try again.");
                attempts = (attempts + 1);
                guess = keyboard.nextInt();
            }
            //Otherwise, the program will tell the user that the guess was too low.
            else {
                System.out.println("You guessed too low. Please try again.");
                attempts = (attempts + 1);
                guess = keyboard.nextInt();
            }
        }

        //This is the congrats message.
        System.out.println("__________________________________________");
        System.out.println("CORRECT! The picked number was "+pickedNumber+"!");
        System.out.println("Total tries: "+attempts);
        System.out.println("__________________________________________");
    }
}

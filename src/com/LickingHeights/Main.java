package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        int guess;
        int pickedNumber;
        int attempts;
        pickedNumber = (int)(Math.random()*100);
        attempts = 1;
        System.out.println(pickedNumber);
        System.out.println("Welcome to my Number Guessing Game! To start, please guess a number between 1 and 100.");
        guess = keyboard.nextInt();
    }
}

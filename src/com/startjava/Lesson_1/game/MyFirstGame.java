package com.startjava.Lesson_1.game;

public class MyFirstGame {
    public static void main(String[] args) {
        System.out.println("TASK: Guess a number (from 0 to 100).");
        
        byte unknownNumber = 23;
        byte userNumber = 0;
        while (userNumber != unknownNumber) {
            System.out.println("Enter your number:" + userNumber);
            if (userNumber > unknownNumber) {
                userNumber -= 3;
                System.out.println("This number is smaller than the one the computer riddled");
            } else if (userNumber < unknownNumber) {
                userNumber += 5;
                System.out.println("This number is greater than the number that the computer riddled");
            }
        }
        System.out.println("Enter your number:" + userNumber + "\n" + "Congratulations, the number has been guessed!");
    }
}
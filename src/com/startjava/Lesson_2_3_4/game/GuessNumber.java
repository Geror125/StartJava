package com.startjava.Lesson_2_3_4.game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    Scanner scan = new Scanner(System.in);

    private final Player player1;
    private final Player player2;
    private final int targetNumber;
    private int attemptNumber;

    public GuessNumber(Player player1, Player player2) {
        Random number = new Random();
        targetNumber = number.nextInt(100) + 1;
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        do {
            if (makeMove(player1) || makeMove(player2)) {
                break;
            }
            attemptNumber++;
        } while(true);
    }

    public boolean makeMove(Player player) {
        inputNumber(player);
        if (compareNumber(player) || attemptNumber == 9) {
            if (attemptNumber > 8) {
                System.out.println("The " + player.getName() + " has run out of attempts.");
            }
            if (player == player2 || player.getNumber(attemptNumber) == targetNumber) {
                showEnteredNumber(player1);
                showEnteredNumber(player2);
                return true;
            }
        }
        return false;
    }

    public void inputNumber(Player player) {
        System.out.println(" You have " + (10 - attemptNumber) + " tries left");
        System.out.print(player.getName() + "\n  Enter your number: ");
        player.setNumber(attemptNumber, scan.nextInt());
    }

    public boolean compareNumber(Player player) {
        if (player.getNumber(attemptNumber) == targetNumber) {
            System.out.println("Player " + player.getName() + " guessed number " + targetNumber + " from " + (attemptNumber + 1) + " tries");
            return true;
        }
        String lessOrMore = player.getNumber(attemptNumber) < targetNumber ? ">" : "<";
        System.out.println("This number is " + lessOrMore + " than the number that the computer riddled");
        return false;
    }

    public void showEnteredNumber(Player player) {
        int i = attemptNumber + 1;
        if (player1.getNumber(attemptNumber) == targetNumber && player == player2) {
            i = attemptNumber;
        }
        for (int number: player.getNumbers(i)){
            System.out.print(number + " ");
        }
        System.out.println(" ");
    }
}
package com.startjava.Lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    Scanner scan = new Scanner(System.in);

    private final Player player1;
    private final Player player2;
    private final int targetNumber;

    public GuessNumber(Player player1, Player player2) {
        Random number = new Random();
        targetNumber = number.nextInt(100) + 1;
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        for (int i = 0; i < 10; i++) {
            if (i < 9) {
                System.out.println("You have " + (10-i) + " tries left");
                System.out.print(player1.getName() + "\n  Enter your number:");
                int[] player1Numbers = new int[10];
                player1Numbers[i] = scan.nextInt();
                if (player1Numbers[i] == targetNumber) {
                    System.out.println("Player " + player1.getName() + " guessed number " + targetNumber + " from " + (i+1) + " tries");
                    player1.setPlayerNumbers(player1Numbers);
                    System.out.println(Arrays.toString(Arrays.copyOf(player1.getPlayerNumbers(), i+1)));
                    break;
                }
                if (player1Numbers[i] > targetNumber) {
                    System.out.println("This number is < than the one the computer riddled");
                } else {
                    System.out.println("This number is > than the number that the computer riddled");
                }
            } else {
                System.out.println(player1.getName() + " has run out of tries.");
                System.out.println(Arrays.toString(player1.getPlayerNumbers()));
            }

            if (i < 9) {
                System.out.println("You have " + (10-i) + " tries left");
                System.out.print(player2.getName() + "\n  Enter your number:");
                int[] player2Numbers = new int[10];
                player2Numbers[i] = scan.nextInt();
                player2.setPlayerNumbers(new int[]{player2Numbers[i]});
                if (player2Numbers[i] == targetNumber) {
                    System.out.println("Player " + player2.getName() + " guessed number " + targetNumber + " from " + (i+1) + " tries");
                    System.out.println(Arrays.toString(Arrays.copyOf(player2.getPlayerNumbers(), i+1)));
                    break;
                }
                if (player2Numbers[i] > targetNumber) {
                    System.out.println("This number is < than the one the computer riddled");
                } else {
                    System.out.println("This number is > than the number that the computer riddled");
                }
            } else {
                System.out.println(player2.getName() + " has run out of tries.");
                System.out.println(Arrays.toString(player2.getPlayerNumbers()));
            }
        }
    }
}
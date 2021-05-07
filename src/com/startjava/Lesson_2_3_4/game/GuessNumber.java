package com.startjava.Lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    Scanner scan = new Scanner(System.in);

    private final Player player1;
    private final Player player2;
    private final int targetNumber;
    private int number;
    private int i;
    private int[] copyOfPlayer1;
    private int[] copyOfPlayer2;

    public GuessNumber(Player player1, Player player2) {
        Random number = new Random();
        targetNumber = number.nextInt(100) + 1;
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        do {
            if (move(player1)) {
                break;
            }
            if (move(player2)) {
                break;
            }
            i++;
        } while (true);
        restart();
    }

    public boolean move(Player name) {
        numberInput(name);
        if (tips(name)) {
            return true;
        }
        if (i == 9) {
            if (name == player2) {
                loss();
                enteredNumbers();
                return true;
            }
        }
        return false;
    }

    public void numberInput(Player name) {
        System.out.println(" You have " + (10 - i) + " tries left");
        System.out.print(name.getName() + "\n  Enter your number: ");
        number = scan.nextInt();
        name.setPlayerNumbers(i, number);
    }

    public boolean tips(Player name) {
        if (number == targetNumber) {
            System.out.println("Player " + name.getName() + " guessed number " + targetNumber + " from " + (i + 1) + " tries");
            enteredNumbers();
            return true;
        }
        if (number < targetNumber) {
            System.out.println("  This number is > than the number that the computer riddled");
        } else if (i == 9) {
            System.out.println("The " + name.getName() + " has run out of attempts.");
        } else {
            System.out.println("  This number is < than the one the computer riddled");
        }
        copyOfPlayer1 = Arrays.copyOf(player1.getPlayerNumbers(), i + 1);
        copyOfPlayer2 = Arrays.copyOf(player2.getPlayerNumbers(), i + 1);
        return false;
    }

    public void loss() {
        System.out.println("You lost, the number was: " + targetNumber);
    }

    public void enteredNumbers() {
            System.out.println(Arrays.toString(copyOfPlayer1));
            System.out.println(Arrays.toString(copyOfPlayer2));
    }

    public void restart() {
        Arrays.fill(copyOfPlayer1, 0);
        Arrays.fill(copyOfPlayer2, 0);
    }
}
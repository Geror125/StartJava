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
    private int section;

    public GuessNumber(Player player1, Player player2) {
        Random number = new Random();
        targetNumber = number.nextInt(100) + 1;
        this.player1 = player1;
        this.player2 = player2;

    }

    public void start() {
        do {
            if (makeMove(player1)) {
                break;
            } else if (makeMove(player2)) {
                break;
            }
            section++;
        } while (true);
    }

    public boolean makeMove(Player player) {
        inputNumber(player);
        if (compareNums (player)) {
            return true;
        }
        if (section == 9) {
            if (player == player2) {
                enumeration(player1);
                enumeration(player2);
                return true;
            }
        }
        return false;
    }

    public void inputNumber(Player player) {
        System.out.println(" You have " + (10 - section) + " tries left");
        System.out.print(player.getName() + "\n  Enter your number: ");
        number = scan.nextInt();
        player.setNumber(section, number);
    }

    public boolean compareNums(Player player) {
        if (number == targetNumber) {
            System.out.println("Player " + player.getName() + " guessed number " + targetNumber + " from " + (section + 1) + " tries");
            enumeration(player1);
            enumeration(player2);
            return true;
        }
        System.out.println(number < targetNumber ? "  This number is > than the number that the computer riddled"
                : section == 9 ? "The " + player.getName() + " has run out of attempts."
                : "  This number is < than the one the computer riddled");
        return false;
    }

    public void enumeration(Player player) {
        for (int i = 0; i <= section; i++){
            System.out.print(player.getNumber(i) + " ");
        }
        System.out.println(" ");
    }
}
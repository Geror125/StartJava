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
            }
            if (makeMove(player2)) {
                break;
            }
            i++;
        } while (true);
        clearNums();
        enteredNumbers();
    }

    public boolean makeMove(Player name) {
        inputNumber(name);
        if (hint (name)) {
            return true;
        }
        if (i == 9) {
            if (name == player2) {
                enteredNumbers();
                return true;
            }
        }
        return false;
    }

    public void inputNumber(Player name) {
        System.out.println(" You have " + (10 - i) + " tries left");
        System.out.print(name.getName() + "\n  Enter your number: ");
        number = scan.nextInt();
        name.setNumber(i, number);
    }

    public boolean hint(Player name) {
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
        return false;
    }

    public void enteredNumbers() {
        System.out.println(Arrays.toString(player1.getNumbers(i + 1)));
        System.out.println(Arrays.toString(player2.getNumbers(i + 1)));
    }

    public void clearNums() {
        Arrays.fill(player1.getNumbers(i), 0);
        Arrays.fill(player2.getNumbers(i), 0);
    }
}
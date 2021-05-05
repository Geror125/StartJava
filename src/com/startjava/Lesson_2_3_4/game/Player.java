package com.startjava.Lesson_2_3_4.game;

public class Player {
    private final String name;
    private int[] playerNumbers = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getPlayerNumbers() {
        return playerNumbers;
    }

    public int[] setPlayerNumbers(int[] playerNumbers) {
        this.playerNumbers = playerNumbers;
        return playerNumbers;
    }
//    public void setPlayerNumbers(int index, int number) {
//        playerNumbers[index] = number;
//    }
}
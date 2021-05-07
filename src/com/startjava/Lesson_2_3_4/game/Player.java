package com.startjava.Lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private final String name;
    private final int[] numbers = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getPlayerNumbers() {
        return Arrays.copyOf(numbers, numbers.length);
    }

    public void setPlayerNumbers(int index, int number) {
        numbers[index] = number;
    }
}
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

    public int[] getNumbers(int index) {
        return Arrays.copyOf(numbers, index);
    }

    public void setNumber(int index, int number) {
        numbers[index] = number;
    }
}
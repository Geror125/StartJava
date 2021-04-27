package com.startjava.Lesson_1.calculator;

public class Calculator {
    public static void main(String[] args) {
        int firstNumber = 2;
        int secondNumber = 4;
        int result = 1;
        char operation = '^';
        if (operation == '+') {
            result = firstNumber + secondNumber;
        } else if (operation == '-') {
            result = firstNumber - secondNumber;
        } else if (operation == '*') {
            result = firstNumber * secondNumber;
        } else if (operation == '/') {
            result = firstNumber / secondNumber;
        } else if (operation == '^') {
            for (int i = 1; i <= secondNumber; i++) {
                result *= firstNumber;
            }
        } else if (operation == '%') {
            result = firstNumber % secondNumber;
        }
        System.out.println(result);
    }
}
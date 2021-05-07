package com.startjava.Lesson_2_3_4.calculator;

import java.lang.Math;

public class Calculator {

    private String expression;
    private int firstNumber;
    private String sign;
    private int secondNumber;

    public void setExpression(String expression) {
        this.expression = expression;
    }

    private void splitExpression() {
        String[] words = expression.split(" ");
        firstNumber = Integer.parseInt(words[0]);
        sign = words[1];
        secondNumber = Integer.parseInt(words[2]);
    }

    public double calculate() {
        splitExpression();
        switch (sign) {
            case "+":
                return Math.addExact(firstNumber, secondNumber);
            case "-":
                return Math.subtractExact(firstNumber, secondNumber);
            case "*":
                return Math.multiplyExact(firstNumber, secondNumber);
            case "/":
                return Math.floorDiv(firstNumber, secondNumber);
            case "^":
                return Math.pow(firstNumber, secondNumber);
        }
        return 0;
    }
}
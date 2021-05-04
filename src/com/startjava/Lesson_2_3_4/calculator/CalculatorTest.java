package com.startjava.Lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        String reply = "yes";
        while (reply.equals("yes")) {
            Calculator calculator = new Calculator();
            Scanner scan = new Scanner(System.in);

            System.out.print("Enter the expression: ");
            calculator.setExpression(scan.next());
            calculator.assignment();

            System.out.println("Result: " + calculator.calculate());

            do {
                System.out.print("Do you want to continue computing? [yes/no]: ");
                reply = scan.next();
            } while (!reply.equals("yes") && !reply.equals("no"));
        }
    }
}
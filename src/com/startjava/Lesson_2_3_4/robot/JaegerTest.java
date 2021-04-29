package com.startjava.Lesson_2_3_4.robot;

public class JaegerTest {

    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();
        jaegerOne.setName("Cherno Alpha");
        jaegerOne.setMark("Mark-1");
        jaegerOne.setOrigin("Russia");
        jaegerOne.setHeight(280);
        jaegerOne.setWeight(2412);

        Jaeger jaegerTwo = new Jaeger();
        jaegerTwo.setName("Gipsy Danger");
        jaegerTwo.setMark("Mark-3");
        jaegerTwo.setOrigin("United States of America");
        jaegerTwo.setHeight(260);
        jaegerTwo.setWeight(1980);

        System.out.println(jaegerOne.getName() + "\n" + jaegerOne.getMark() + "\n" + jaegerOne.getOrigin() + "\n" + jaegerOne.getHeight() + "\n" + jaegerOne.getWeight() + "\n");
        System.out.println(jaegerTwo.getName() + "\n" + jaegerTwo.getMark() + "\n" + jaegerTwo.getOrigin() + "\n" + jaegerTwo.getHeight() + "\n" + jaegerTwo.getWeight() + "\n");

        jaegerOne.drift();
        jaegerTwo.drift();
        jaegerOne.move();
        jaegerTwo.move();
    }
}
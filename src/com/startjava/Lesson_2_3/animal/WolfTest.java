package com.startjava.Lesson_2_3.animal;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.setGender("girl");
        wolfOne.setPetName("Girl");
        wolfOne.setWeight(27);
        wolfOne.setPaintColor("Brown");
        System.out.println("gender = " + wolfOne.getGender());
        System.out.println("petName = " + wolfOne.getPetName());
        System.out.println("weight = " + wolfOne.getWeight());
        wolfOne.setAge(9);
        System.out.println("age = " + wolfOne.getAge());
        System.out.println("paintColor = " + wolfOne.getPaintColor());
        wolfOne.walk();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
    }
}
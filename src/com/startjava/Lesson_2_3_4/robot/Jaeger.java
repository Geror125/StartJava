package com.startjava.Lesson_2_3_4.robot;

public class Jaeger {
    private String name;
    private String mark;
    private String origin;
    private int height;
    private int weight;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getMark() {
        return mark;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getOrigin() {
        return origin;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public boolean drift() {
        return true;
    }

    public void move() {
        System.out.println("moving");
    }
}
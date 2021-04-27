package com.startjava.Lesson_2.animal;

public class Wolf {
    private String gender = "male";
    private String petName = "foam";
    private int weight = 30;
    private int age = 6;
    private String paintColor = "milky";

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
            this.petName = petName;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
            this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    void setAge(int age) {
        if (age > 8) {
            System.out.println("Incorrect age");
        } else {
            this.age = age;
        }
    }

    public String getPaintColor() {
        return paintColor;
    }

    public void setPaintColor(String paintColor) {
            this.paintColor = paintColor;
    }

    public void walk() {
        System.out.println("walks");
    }

    public void sit() {
        System.out.println("sits");
    }

    public void run() {
        System.out.println("runs");
    }

    public void howl() {
        System.out.println("howls");
    }
    
    public void hunt() {
        System.out.println("hunts");
    }
}
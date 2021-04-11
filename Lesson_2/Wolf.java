public class Wolf {
    String gender;
    String petName;
    byte weight;
    byte age;
    String paintColor;

    String walk() {
        return "walks";
    }
    String sit() {
        return "sits";
    }
    String run() {
        return "runs";
    }
    String howl() {
        return "howls";
    }
    String hunt() {
        return "hunts";
    }
    
    public Wolf(String gender, String petName, byte weight, byte age, String paintColor) {
        this.gender = gender;
        this.petName = petName;
        this.weight = weight;
        this.age = age;
        this.paintColor = paintColor;
    }
}
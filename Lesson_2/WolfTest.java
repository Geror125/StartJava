public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        System.out.println("gender = " + wolfOne.gender);
        System.out.println("petName = " + wolfOne.petName);
        System.out.println("weight = " + wolfOne.weight);
        System.out.println("age = " + wolfOne.age);
        System.out.println("paintColor = " + wolfOne.paintColor);
        wolfOne.walk();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
    }
}
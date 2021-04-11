public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        System.out.println(wolfOne.gender);
        System.out.println(wolfOne.petName);
        System.out.println(wolfOne.weight);
        System.out.println(wolfOne.age);
        System.out.println(wolfOne.paintColor);
        wolfOne.walk();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
    }
}
public class MyFirstGame {
    public static void main(String[] args) {
        byte unknownNumber = 30;
        byte userNumber = 30;
        System.out.println("TASK: Guess a number (from 0 to 100).");
        System.out.println("Enter your number:" + userNumber);
        
        if (userNumber > unknownNumber) {
            System.out.println("This number is smaller than the one the computer riddled");
        } else if (userNumber < unknownNumber) {
            System.out.println("This number is greater than the number that the computer riddled");
        } else {
            System.out.println("Congratulations, the number has been guessed!");
        }
    }
}
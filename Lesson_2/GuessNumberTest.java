import java.util.Random;
import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        String reply = "yes";

        while (reply.equals("yes")) {
            Scanner scan = new Scanner(System.in);
            GuessNumber guessNumber = new GuessNumber();
            Random number = new Random();
            Player playerOne = new Player("Jony");
            Player playerTwo = new Player("Dilan");

            do {
                guessNumber.setRandomNumber(number.nextInt(100));
            } while (guessNumber.getRandomNumber() == 0);

            do {
                System.out.print(playerOne.name + "  Enter your number:");
                playerOne.number = scan.nextInt();
                if (playerOne.number > guessNumber.getRandomNumber()) {
                    System.out.println("This number is < than the one the computer riddled");
                } else if (playerOne.number < guessNumber.getRandomNumber()) {
                    System.out.println("This number is > than the number that the computer riddled");
                }
                if (playerOne.number == guessNumber.getRandomNumber()) {
                    break;
                }

                System.out.print(playerTwo.name + "  Enter your number:");
                playerTwo.number = scan.nextInt();
                if (playerTwo.number > guessNumber.getRandomNumber()) {
                    System.out.println("This number is < than the one the computer riddled");
                } else if (playerTwo.number < guessNumber.getRandomNumber()) {
                    System.out.println("This number is > than the number that the computer riddled");
                }
            } while (playerTwo.number != guessNumber.getRandomNumber());

            System.out.println("You guessed the number!!!" + guessNumber.getRandomNumber());

            do {
                System.out.print("Do you want to continue computing? [yes/no]: ");
                reply = scan.next();
            } while (!reply.equals("yes") && !reply.equals("no"));
        }
    }
}
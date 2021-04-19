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
                System.out.print(playerOne.getName() + "  Enter your number:");
                guessNumber.setFirstPlayerNumber(scan.nextInt());
                guessNumber.hintForTheFirstPlayer();
                if (guessNumber.getFirstPlayerNumber() == guessNumber.getRandomNumber()) {
                    break;
                }

                System.out.print(playerTwo.getName() + "  Enter your number:");
                guessNumber.setSecondPlayerNumber(scan.nextInt());
                guessNumber.hintForTheSecondPlayer();
            } while (guessNumber.getSecondPlayerNumber() != guessNumber.getRandomNumber());

            System.out.println("You guessed the number!!!" + guessNumber.getRandomNumber());

            do {
                System.out.print("Do you want to continue computing? [yes/no]: ");
                reply = scan.next();
            } while (!reply.equals("yes") && !reply.equals("no"));
        }
    }
}
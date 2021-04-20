import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    Scanner scan = new Scanner(System.in);
    Random number = new Random();
    Player player1 = new Player();
    Player player2 = new Player();

    private int randomNumber;
    private int playerNumber;

    public void hint() {
        if (playerNumber > randomNumber) {
            System.out.println("This number is < than the one the computer riddled");
        } else if (playerNumber < randomNumber) {
            System.out.println("This number is > than the number that the computer riddled");
        }
    }

    public void start() {
        randomNumber = number.nextInt(100) + 1;

        do {
            System.out.print(player1.getName() + "\n  Enter your number:");
            playerNumber = scan.nextInt();
            hint();
            if (playerNumber == randomNumber) {
                System.out.println("Winning player : " + player1.getName());
                break;
            }

            System.out.print(player2.getName() + "\n  Enter your number:");
            playerNumber = scan.nextInt();
            hint();
            if (playerNumber == randomNumber) {
                System.out.println("Winning player : " + player2.getName());
                break;
            }
        } while (playerNumber != randomNumber);
    }
}
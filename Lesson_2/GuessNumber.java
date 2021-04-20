import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    Scanner scan = new Scanner(System.in);
    Random number = new Random();

    private Player player1;
    private Player player2;
    private int randomNumber;
    private int playerNumber;
    private boolean reply = true;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        randomNumber = number.nextInt(100) + 1;

        do {
            System.out.print(player1.getName() + "\n  Enter your number:");
            playerNumber = scan.nextInt();
            compareNumbers();
            if (reply == false) {
                break;
            }

            System.out.print(player2.getName() + "\n  Enter your number:");
            playerNumber = scan.nextInt();
            compareNumbers();
        } while (reply == true);
    }

    private void compareNumbers() {
        if (playerNumber > randomNumber) {
            System.out.println("This number is < than the one the computer riddled");
        } else if (playerNumber < randomNumber) {
            System.out.println("This number is > than the number that the computer riddled");
        }if (playerNumber == randomNumber) {
            System.out.println("Winning!!!");
            reply = false;
        }
    }
}
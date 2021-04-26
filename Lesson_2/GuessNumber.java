import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    Scanner scan = new Scanner(System.in);

    private Player player1;
    private Player player2;
    private int targetNumber;
    private int playerNumber;

    public GuessNumber(Player player1, Player player2) {
        Random number = new Random();
        targetNumber = number.nextInt(100) + 1;
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        do {
            System.out.print(player1.getName() + "\n  Enter your number:");
            playerNumber = scan.nextInt();
            if (compareNumbers()) {
                break;
            }

            System.out.print(player2.getName() + "\n  Enter your number:");
            playerNumber = scan.nextInt();
            if (compareNumbers()) {
                break;
            }
        } while(true);
    }

    private boolean compareNumbers() {
        if (playerNumber > targetNumber || playerNumber < targetNumber) {
            if (playerNumber > targetNumber) {
                System.out.println("This number is < than the one the computer riddled");
            } else if (playerNumber < targetNumber) {
                System.out.println("This number is > than the number that the computer riddled");
            }
            return false;
        } else {
            System.out.println("Winning!!!");
            return true;
        }
    }
}
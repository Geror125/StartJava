import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    Scanner scan = new Scanner(System.in);
    Random number = new Random();

    private String player1;
    private String player2;
    private int randomNumber;
    private int playerNumber;

    public GuessNumber (String player1, String player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

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
            System.out.print(player1 + "\n  Enter your number:");
            playerNumber = scan.nextInt();
            hint();
            if (playerNumber == randomNumber) {
                System.out.println("Winning player : " + player1);
                break;
            }

            System.out.print(player2 + "\n  Enter your number:");
            playerNumber = scan.nextInt();
            hint();
            if (playerNumber == randomNumber) {
                System.out.println("Winning player : " + player2);
                break;
            }
        } while (playerNumber != randomNumber);
    }
}
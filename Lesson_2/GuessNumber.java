import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    Scanner scan = new Scanner(System.in);
    Random number = new Random();
    Player playerOne = new Player();
    Player playerTwo = new Player();

    private int randomNumber;
    private int firstPlayerNumber;
    private int secondPlayerNumber;


    public int getFirstPlayerNumber() {
        return firstPlayerNumber;
    }

    public void setFirstPlayerNumber(int firstPlayerNumber) {
        this.firstPlayerNumber = firstPlayerNumber;
    }

    public int getSecondPlayerNumber() {
        return secondPlayerNumber;
    }

    public void setSecondPlayerNumber(int secondPlayerNumber) {
        this.secondPlayerNumber = secondPlayerNumber;
    }

    public int getRandomNumber() {
        return randomNumber;
    }

    public void setRandomNumber(int randomNumber) {
        this.randomNumber = randomNumber;
    }

    public void hintForTheFirstPlayer() {
        if (firstPlayerNumber > randomNumber) {
            System.out.println("This number is < than the one the computer riddled");
        } else if (firstPlayerNumber < randomNumber) {
            System.out.println("This number is > than the number that the computer riddled");
        }
    }

    public void hintForTheSecondPlayer() {
        if (secondPlayerNumber > randomNumber) {
            System.out.println("This number is < than the one the computer riddled");
        } else if (secondPlayerNumber < randomNumber) {
            System.out.println("This number is > than the number that the computer riddled");
        }
    }

    public void Game() {
        do {
            setRandomNumber(number.nextInt(100));
        } while (randomNumber == 0);

        System.out.print("Enter the name of the first player :  ");
        playerOne.setName(scan.next());

        System.out.print("Enter the name of the second player :  ");
        playerTwo.setName(scan.next());

        do {
            System.out.print(playerOne.getName() + "\n  Enter your number:");
            setFirstPlayerNumber(scan.nextInt());
            hintForTheFirstPlayer();
            if (getFirstPlayerNumber() == getRandomNumber()) {
                System.out.println("Winning player : " + playerOne.getName());
                break;
            }

            System.out.print(playerTwo.getName() + "\n  Enter your number:");
            setSecondPlayerNumber(scan.nextInt());
            hintForTheSecondPlayer();
            if (getSecondPlayerNumber() == getRandomNumber()) {
                System.out.println("Winning player : " + playerTwo.getName());
                break;
            }
        } while (getSecondPlayerNumber() != getRandomNumber());
    }
}
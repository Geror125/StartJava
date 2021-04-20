import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String reply = "yes";

        while (reply.equals("yes")) {

            System.out.print("Enter the name of the first player :  ");
            String name1 = scan.nextLine();
            Player playerOne = new Player(name1);

            System.out.print("Enter the name of the second player :  ");
            String name2 = scan.nextLine();
            Player playerTwo = new Player(name2);

            GuessNumber game = new GuessNumber(playerOne.getName(), playerTwo.getName());

            game.start();

            do {
                System.out.print("Do you want to continue computing? [yes/no]: ");
                reply = scan.next();
            } while (!reply.equals("yes") && !reply.equals("no"));
        }
    }
}
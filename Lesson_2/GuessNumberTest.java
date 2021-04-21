import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String reply = "yes";

        while (reply.equals("yes")) {
            System.out.print("Enter the name of the first player :  ");
            Player player1 = new Player(scan.nextLine());

            System.out.print("Enter the name of the second player :  ");
            Player player2 = new Player(scan.nextLine());

            GuessNumber game = new GuessNumber(player1, player2);

            game.start();
            do {
                System.out.print("Do you want to continue computing? [yes/no]: ");
                reply = scan.next();
            } while (!reply.equals("yes") && !reply.equals("no"));
        }
    }
}
import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        String reply = "yes";
        

        while (reply.equals("yes")) {
            Scanner scan = new Scanner(System.in);
            GuessNumber game = new GuessNumber();
            Player player = new Player("nameOne", "nameTwo");

            System.out.print("Enter the name of the first player :  ");
            player.nameOne = scan.next();

            System.out.print("Enter the name of the second player :  ");
            player.nameTwo = scan.next();

            game.start();

            do {
                System.out.print("Do you want to continue computing? [yes/no]: ");
                reply = scan.next();
            } while (!reply.equals("yes") && !reply.equals("no"));
        }
    }
}
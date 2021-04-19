import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        String reply = "yes";

        while (reply.equals("yes")) {
            Scanner scan = new Scanner(System.in);
            GuessNumber guessNumber = new GuessNumber();

            guessNumber.Game();

            do {
                System.out.print("Do you want to continue computing? [yes/no]: ");
                reply = scan.next();
            } while (!reply.equals("yes") && !reply.equals("no"));
        }
    }
}
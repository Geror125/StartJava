import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        String reply = "yes";
        

        while (reply.equals("yes")) {
            Scanner scan = new Scanner(System.in);
            Player player1 = new Player(name1);
            Player player2 = new Player(name2);
            
            System.out.print("Enter the name of the first player :  ");
            String name1 = scan.nextLine();

            System.out.print("Enter the name of the second player :  ");
            String name2 = scan.nextLine();


            game.start();

            do {
                System.out.print("Do you want to continue computing? [yes/no]: ");
                reply = scan.next();
            } while (!reply.equals("yes") && !reply.equals("no"));
        }
    }
}
import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        String reply = "yes";

        while (reply.equals("yes")) {
            Calculator calculator = new Calculator();
            Scanner scan = new Scanner(System.in);

            System.out.print("Enter the first number: ");
            calculator.setFirstNumber(scan.nextInt());

            System.out.print("Enter the sign of the mathematical operation: ");
            calculator.setSign(scan.next().charAt(0));

            System.out.print("Enter the second number: ");
            calculator.setSecondNumber(scan.nextInt());

            System.out.println("Result: " + calculator.getCalculate());

            do {
                System.out.print("Do you want to continue computing? [yes/no]: ");
                reply = scan.next();
            } while (!reply.equals("yes") && !reply.equals("no"));
        }
    }
}
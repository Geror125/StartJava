import java.util.Scanner;

public class CalculatorTest {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.print("Enter the first number: ");
        calculator.setFirstNumber(scan.nextInt());

        System.out.print("Enter the sign of the mathematical operation: ");
        calculator.setSign(scan.next().charAt(0));

        System.out.print("Enter the second number: ");
        calculator.setSecondNumber(scan.nextInt());

        System.out.println("Result: " + calculator.getResult());
        
        System.out.print("Do you want to continue computing? [yes/no]: ");
        String toContinue = scan.nextLine();
        if (toContinue == "yes") {
            return;
        } else if (toContinue == "no") {
            System.out.print("The program comes to an end");
            break;
        }else {
            return;
        }
    }
}
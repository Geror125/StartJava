import java.util.Scanner;

public class JaegerTest {

    public static void main(String[] args) {

        Jaeger jaeger = new Jaeger();
        Scanner scan = new Scanner(System.in);

        for (byte numberJaeger = 1; numberJaeger <= 2; numberJaeger++) {
            System.out.print("Name: ");
            jaeger.setName(scan.next());

            System.out.print("Mark:");
            jaeger.setMark(scan.next());

            System.out.print("Origin:");
            jaeger.setOrigin(scan.next());

            System.out.print("Height:");
            jaeger.setHeight(scan.nextShort());

            System.out.print("Weight:");
            jaeger.setWeight(scan.nextShort());

            System.out.print("Speed:");
            jaeger.setSpeed(scan.nextByte());

            System.out.print("Stregth:");
            jaeger.setStregth(scan.nextByte());

            System.out.print("Armor:");
            jaeger.setArmor(scan.nextByte());

            jaeger.drift();
            jaeger.move();
            jaeger.scanKaiju();
            jaeger.useVortexCannon();

            System.out.print("\n");
        }
    }
}
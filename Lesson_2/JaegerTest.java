import java.util.Scanner;

public class JaegerTest {

    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();
        Jaeger jaegerTwo = new Jaeger();
        Scanner scan = new Scanner(System.in);

        System.out.print("The First Jaeger.\nName: ");
        jaegerOne.setName(scan.next());

        System.out.print("Mark:");
        jaegerOne.setMark(scan.next());

        System.out.print("Origin:");
        jaegerOne.setOrigin(scan.next());

        System.out.print("Height:");
        jaegerOne.setHeight(scan.nextShort());

        System.out.print("Weight:");
        jaegerOne.setWeight(scan.nextShort());

        System.out.print("Speed:");
        jaegerOne.setSpeed(scan.nextByte());

        System.out.print("Stregth:");
        jaegerOne.setStregth(scan.nextByte());

        System.out.print("Armor:");
        jaegerOne.setArmor(scan.nextByte());

        jaegerOne.drift();
        jaegerOne.move();
        jaegerOne.scanKaiju();
        jaegerOne.useVortexCannon();

        System.out.print("\n");

        System.out.print("The Second Jaeger.\nName: ");
        jaegerTwo.setName(scan.next());

        System.out.print("Mark:");
        jaegerTwo.setMark(scan.next());

        System.out.print("Origin:");
        jaegerTwo.setOrigin(scan.next());

        System.out.print("Height:");
        jaegerTwo.setHeight(scan.nextShort());

        System.out.print("Weight:");
        jaegerTwo.setWeight(scan.nextShort());

        System.out.print("Speed:");
        jaegerTwo.setSpeed(scan.nextByte());

        System.out.print("Stregth:");
        jaegerTwo.setStregth(scan.nextByte());

        System.out.print("Armor:");
        jaegerTwo.setArmor(scan.nextByte());

        jaegerTwo.drift();
        jaegerTwo.move();
        jaegerTwo.scanKaiju();
        jaegerTwo.useVortexCannon();
    }
}
public class Cycle {
    public static void main(String[] args) {
        for (byte i = 0; i <= 20; i++) {
            System.out.print(i + " ");
        }
        System.out.println(";");

        int x = 8;
        while (x >= -4) {
            x -= 2;
            System.out.print(x + " ");
        } 
        System.out.println(";");

        byte n = 0;
        int m = 10;
        do {
            if (m % 2 != 0) {
                n++;
                System.out.println(m + ";");
            }
            m += 1;
        } while(m <= 20);
        System.out.println(n + ";");
    }
}
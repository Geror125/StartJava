public class Unicode {
    public static void main(String[] args) {
        System.out.println("Unicode symbols and codes:\n№ symbol");
        for (byte number = 33; number <= 126; number++) {
            char symbol = (char) number;
            System.out.printf("%03d %3s", number, symbol + "\n");
        }
    }
}
public class Unicode {
    public static void main(String[] args) {
        System.out.println("Unicode symbols and codes:\n# symbol");
        for(int number = 33; number <= 128; number++){
            char symbol = (char)number;
            System.out.println(number + " - " + symbol);
        }
    }
}
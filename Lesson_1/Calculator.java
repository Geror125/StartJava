public class Calculator {
    public static void main(String[] args) {
        int oneNumber = 2;
        int twoNumber = 4;
        int result = 0;
        char operation = '^';
        if (operation == '+') {
            result = oneNumber + twoNumber;
            System.out.println(result);
        } else if (operation == '-') {
            result = oneNumber - twoNumber;
            System.out.println(result);
        } else if (operation == '*') {
            result = oneNumber * twoNumber;
            System.out.println(result);
        } else if (operation == '/') {
            result = oneNumber / twoNumber;
            System.out.println(result);
        } else if (operation == '^') {
            int sum = 1;
            for (int i = 1; i <= twoNumber; i++) {
                sum = oneNumber * oneNumber;
                result = result + sum;
            }
            System.out.println(result);
        } else if (operation == '%') {
            result = oneNumber % twoNumber;
            System.out.println(result);
        }
    }
}
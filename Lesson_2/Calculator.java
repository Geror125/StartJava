public class Calculator {
    private int firstNumber;
    private int secondNumber;
    private char sign;

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public int calculate() {
        switch (sign) {
            case '+' :
                return firstNumber + secondNumber;
            case '-' :
                return firstNumber - secondNumber;
            case '*' :
                return firstNumber * secondNumber;
            case '/' :
                return firstNumber / secondNumber;
            case '^' :
                int result = 1;
                for (int i = 1; i <= secondNumber; i++) {
                    result *= firstNumber;
                }
                return result;
            case '%' :
                return firstNumber % secondNumber;
        }
        return 0;
    }
}
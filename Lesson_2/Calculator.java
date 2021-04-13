public class Calculator {
    private int calculate;
    private int firstNumber;
    private int secondNumber;
    private char sign;

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
                calculate = 1;
                for (int i = 1; i <= secondNumber; i++) {
                    calculate *= firstNumber;
                }
                break;
            case '%' :
                return firstNumber % secondNumber;
        }
        return calculate;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }
}
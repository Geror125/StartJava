public class Calculator {
    private int result;
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
                result = 1;
                for (int i = 1; i <= secondNumber; i++) {
                    result *= firstNumber;
                }
                break;
            case '%' :
                return firstNumber % secondNumber;
        }
        return result;
    }

    private int firstNumber;
    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    private int secondNumber;
    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }
    
    private char sign;
    public void setSign(char sign) {
        this.sign = sign;
    }
}
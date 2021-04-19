public class GuessNumber {
    private int randomNumber;
    private int firstPlayerNumber;
    private int secondPlayerNumber;


    public int getFirstPlayerNumber() {
        return firstPlayerNumber;
    }

    public void setFirstPlayerNumber(int firstPlayerNumber) {
        this.firstPlayerNumber = firstPlayerNumber;
    }

    public int getSecondPlayerNumber() {
        return secondPlayerNumber;
    }

    public void setSecondPlayerNumber(int secondPlayerNumber) {
        this.secondPlayerNumber = secondPlayerNumber;
    }

    public int getRandomNumber() {
        return randomNumber;
    }

    public void setRandomNumber(int randomNumber) {
        this.randomNumber = randomNumber;
    }

    public void hintForTheFirstPlayer() {
        if (firstPlayerNumber > randomNumber) {
            System.out.println("This number is < than the one the computer riddled");
        } else if (firstPlayerNumber < randomNumber) {
            System.out.println("This number is > than the number that the computer riddled");
        }
    }

    public void hintForTheSecondPlayer() {
        if (secondPlayerNumber > randomNumber) {
            System.out.println("This number is < than the one the computer riddled");
        } else if (secondPlayerNumber < randomNumber) {
            System.out.println("This number is > than the number that the computer riddled");
        }
    }
}
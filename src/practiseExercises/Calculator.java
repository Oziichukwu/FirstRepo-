package practiseExercises;

public class Calculator {

    private boolean isOn;
    private double sum;
    private double difference;
    private double product;
    private double quotient;
    private double square;
    private double cube;
    public void setOn(boolean isOn) {
        this.isOn = isOn;
    }

    public boolean getIsOn() {
        return isOn;
    }

    public void setAddition(double firstNumber, double secondNumber){
        sum = firstNumber + secondNumber;
    }

    public double getAddition() {
        return sum;
    }

    public void setSubtraction(double firstNumber, double secondNumber) {
        difference = firstNumber - secondNumber;
    }

    public double getSubtraction() {
        return difference;
    }

    public void setProduct(double firstNumber, double secondNumber) {
            product = firstNumber * secondNumber;
    }

    public double getProduct() {
        return product;
    }

    public void setDivision(double firstNumber, double secondNumber) {
        quotient = firstNumber / secondNumber;
    }

    public double getQuotient() {
        return quotient;
    }

    public void setSquare(double number) {
        square = number * number;
    }

    public double getSquare() {
        return square;
    }

    public void setCube(double number) {
        cube = number * number * number;
    }

    public double getCube() {
        return cube;
    }
}

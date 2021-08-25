package chapterThree11;

public class BMI {

    private int height;

    private int weight;

    private double BMI;


    public BMI(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if ( height > 0)
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {

        if ( weight > 0)
        this.weight = weight;
    }

    public void setBMI() {

        if ( weight > 0 && height > 0)
        BMI = (weight * 703) / (height * height);

    }

    public double getBMI(){

        return BMI;
    }


}

package chapterThree;

public class AirConditioner {


    private boolean isOn;
    private int currentTemperature = 16;

    public void setOn( boolean isOn) {

        this.isOn = isOn;
    }

    public boolean isOn(){

        return isOn;

    }

    public void increaseTemperature() {

        if ( currentTemperature < 30)

        currentTemperature = currentTemperature + 1;
    }

    public int getcurrentTemperature() {

        return currentTemperature;
    }

    public void decreaseTemperature() {

        if ( currentTemperature > 16 )

    currentTemperature = currentTemperature - 1;
    }
}

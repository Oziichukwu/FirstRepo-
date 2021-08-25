package chapterThree11;

public class AirConditiona {

    private boolean isOn;

    private int temperature = 16;

    public void setOn( boolean isOn) {

            this.isOn = isOn;
    }

    public boolean getIson() {

        return isOn;
    }

    public void increaseTemperature() {

        if ( temperature < 30 )
        temperature = temperature + 1;

    }

    public int getTemperature() {

        return temperature;
    }

    public void decreaseTemperature() {

        if ( temperature > 16 )
     temperature = temperature - 1;
    }
}

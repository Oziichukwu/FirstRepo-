package chapterThree11;

public class AirConditioner {

    int controller;

    boolean isOn;



    public void isOn( boolean isOn ) {

        this.isOn = isOn;
    }

    public int getController() {

     return controller;
    }

    public void increaseTemperature( int temperatureValue ) {
        if ( temperatureValue > 30 ){

            controller = 30;
        }

        if ( temperatureValue <= 30){

            controller = temperatureValue;
        }

        if ( temperatureValue >= 16)

            if ( temperatureValue <= 30)
        controller = temperatureValue + 1;

    }

    public void decreaseTemperature( int temperatureValue ) {

        if ( temperatureValue < 16){

            controller = 16;
        }

        if ( temperatureValue > 16){

            controller = temperatureValue;
        }

        if ( temperatureValue >= 16)

            if ( temperatureValue <= 30)
                controller = temperatureValue - 1;


    }
}

public class AirConditioner {

    int controller;

    public void power( int turnOn) {

        controller = turnOn;
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
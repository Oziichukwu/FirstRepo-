package chapterThree;

public class Bike {

    private boolean isOn;

    private int speed;

    private int gear;

    public void setOn( boolean isOn ) {

        this.isOn = isOn;
    }


    public boolean getIson() {

        return isOn;
    }

    public void accelerateOne( int currentSpeed ) {

        speed =  currentSpeed + 1;
    }

    public int getspeed() {

        return speed;
    }

    public void accelerateTwo( int currentSpeed) {

        speed = currentSpeed + 2;
    }

    public void accelerateThree( int currentSpeed ) {

        speed = currentSpeed + 3;
    }

    public void accelerateFour( int currentSpeed ) {

        speed = currentSpeed + 4;

    }

    public void decelerateOne( int currentSpeed ) {

        speed = currentSpeed - 1;

    }

    public void decelerateTwo( int currentSpeed ) {

        speed = currentSpeed - 2;

    }

    public void decelerateThree( int currentSpeed ) {

        speed = currentSpeed - 3;

    }

    public void decelerateFour( int currentSpeed ) {

        speed = currentSpeed - 4;

    }

    public void gear( int gear, int currentSpeed ) {

        if ( currentSpeed > 0 && currentSpeed <= 20)

                 this.gear = 1;

        if ( currentSpeed > 20 && currentSpeed <= 30)

                 this.gear = 2;

        if ( currentSpeed > 30 && currentSpeed <= 40)

                this.gear = 3;

        if ( currentSpeed > 40 )

                this.gear = 4;

    }

    public int getGear() {

        return gear;
    }
}

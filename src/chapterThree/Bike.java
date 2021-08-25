package chapterThree11;

public class Bike {

    private boolean isOn;

    private int gear;

    private int speed;


    public void setOn( boolean isOn) {

            this.isOn = isOn;
    }

    public boolean getIson() {

        return isOn;
    }

    public void accelerate( int speed, int gear) {
        if ( gear == 1 && speed > 0 && speed < 20) {
            this.speed = speed + 1;
            this.gear = 1;
        }
        if ( gear == 2 && speed >= 21 && speed <= 30) {
            this.speed = speed + 2;
            this.gear = 2;
        }
        if ( gear == 3 && speed >= 30 && speed <= 40) {
            this.speed = speed + 3;
            this.gear = 3;
        }
        if ( gear == 4 && speed > 40 ) {
            this.speed = speed + 4;
            this.gear = 4;
        }

            }

    public int getspeed() {

        return speed;
    }

    public void decelerate( int speed, int gear ) {

        if ( gear == 1 && speed > 0 && speed < 20) {
            this.speed = speed - 1;
            this.gear = 1;
        }
        if ( gear == 2 && speed >= 20 && speed <= 30) {
            this.speed = speed - 2;
            this.gear = 2;
        }
        if ( gear == 3 && speed >= 30 && speed <= 40) {
            this.speed = speed - 3;
            this.gear = 3;
        }
        if ( gear == 4 && speed > 40 ) {
            this.speed = speed - 4;
            this.gear = 4;
        }

    }

    public int getGear() {

        return gear;
    }
}

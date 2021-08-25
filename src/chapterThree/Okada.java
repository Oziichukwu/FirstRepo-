package chapterThree11;

public class Okada {

    private boolean isOn;
    private int gear;
    private int speed;

    public Okada( boolean isOn, int speed, int gear){

        this.isOn = isOn;
        this.speed = speed;
        this.gear = gear;
    }


   public void setOn(boolean isOn) {

       this.isOn = isOn;
    }

    public boolean getIson() {

        return isOn;
    }

    public void accelerate() {

        if ( speed >= 41) {
            speed = speed + 4;
            gear = 4;
        }
        if ( speed >=31 && speed <= 40) {
            speed = speed + 3;
            gear = 3;
            if ( speed > 41)
                gear = 4;
        }
        if ( speed >= 21 && speed <= 30) {
            speed = speed + 2;
            gear = 2;
            if ( speed == 31)
                gear =3;
        }
        if ( speed > 0 && speed <= 20) {
            speed = speed + 1;
                gear = 1;
            if ( speed == 21)
                gear = 2;       }

    }

    public int getspeed() {

        return speed;
    }

    public int getgear() {

        return gear;
    }

    public void decelerate() {

        if ( speed >0 && speed <=20 ) {
            speed = speed - 1;
        }
        if ( speed >= 21 && speed <= 30) {
            speed = speed - 2;
        }
        if ( speed >= 31 && speed <= 40) {

            speed = speed - 3;
        }
        if ( speed >= 41) {
            speed = speed - 4;
        }

    }
}

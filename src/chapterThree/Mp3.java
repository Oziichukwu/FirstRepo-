package chapterThree11;

public class Mp3 {

        private boolean isOn;
        private int volume;
        private int controller;
        private boolean player;

    public void setOn( boolean isOn ) {

        this.isOn = isOn;
    }

    public boolean getIson() {

        return isOn;
    }

    public void increaseVolume() {
        if ( volume <= 20 )
        volume = volume + 1;
    }

    public int getVolume() {

        return volume;
    }

    public void decreaseVolume() {
        if ( volume > 0 )
        volume = volume - 1;
    }

    public void changeSong() {

        controller = controller + 1;
    }

    public int getController() {

        return controller;
    }

//    public void pauseMusic( boolean player) {
//        this.player = player;
//
//    }
/*
    public boolean getpause() {

        return pause;
    }
*/
    public void play( boolean player ) {

        this.player = player;
    }

    public boolean getPlayer() {

        return player;
    }
}

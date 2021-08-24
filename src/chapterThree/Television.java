package chapterThree;

public class Television {

    private boolean isOn;

    private int volume;

    private int channel;

    public void setOn(boolean isOn) {

        this.isOn = isOn;

    }

    public boolean getIson() {

        return isOn;
    }

    public void increaseVolume() {

        volume = volume + 1;
    }

    public int getVolume() {

        return volume;
    }

    public void decreaseVolume() {

        volume = volume - 1;
    }

    public void changeChannel(int setChannel) {

        if (setChannel < 150 && setChannel > 0)
            channel = setChannel;

    }

    public int getChannel() {

        return channel;
    }
}
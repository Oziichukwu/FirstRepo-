package mp3PlayerUsingoop;

import java.util.ArrayList;

public class Mp3Player {

private static ArrayList<Playlist> playlistCollection;

private static ArrayList<Playlist> playlistCollection2;

private static ArrayList<Playlist> playlistCollection3;
    private boolean isOn;

    public Mp3Player() {
        playlistCollection = new ArrayList<>();
        playlistCollection2 = playlistCollection;
        playlistCollection3 = playlistCollection;
    }

    public void setOn(boolean isOn) {

        this.isOn = isOn;
    }

    public boolean getIsOn() {
        return isOn;
    }

    public ArrayList<Playlist> getPlaylist() {
        return playlistCollection;
    }
}

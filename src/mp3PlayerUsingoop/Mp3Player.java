package mp3PlayerUsingoop;

import java.util.List;

public class Mp3Player {

    private MusicState musicState = MusicState.STOP;

    private Playlist playlist = new Playlist();

    private boolean isOn;

    public Playlist getPlaylist() {

        return  playlist;
    }

    public void setOn(boolean isOn) {

        this.isOn = isOn;
    }

    public boolean getIsOn() {
        return isOn;
    }

    public void setMusicState(MusicState currentMusicState){

        musicState = currentMusicState;
    }
    public MusicState getMusicState(){
        return musicState;
    }

//private final List<Playlist>playlistCollection;
//
//    public Mp3Player(List<Playlist> playlistCollection) {
//        this.playlistCollection = playlistCollection;
//
//    }
}

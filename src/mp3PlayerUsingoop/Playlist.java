package mp3PlayerUsingoop;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class Playlist {

    private final List<Music>collectionOfMusic;

    private static List<Music> playlistCollection;


    private MusicState musicState = MusicState.STOP;

    private int shuffleMusic;

    private int volume = 5;
    private int nextMusic;

    public Playlist() {
        playlistCollection = new ArrayList<>();
        collectionOfMusic = new ArrayList<>();
    }


    public void setMusicState(MusicState currentMusicState){

        musicState = currentMusicState;
    }
    public MusicState getMusicState(){
        return musicState;
    }

    public void increaseVolumeBy5() {
        if (volume < 100) {
            volume = volume + 5;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void decreaseVolume() {
        if(volume > 5)
            volume = volume - 5;
    }

    public void Mp3PlayerCanPlayNextMusic() {
        nextMusic = nextMusic + 1;
    }

    public int getNextMusic() {
        return nextMusic;
    }

    public void playPreviousMusic() {
        nextMusic = nextMusic - 1;
    }


    public int playMusicAtRandom(SecureRandom randomNumber) {

        return  0;
    }

    public void addMusicToPlaylist(Music music) {
        playlistCollection.add(music);
    }

    public int getSizeOfPlaylist() {

        return playlistCollection.size();
    }

    public void removeMusicFromPlaylist(Music music) {
        playlistCollection.remove(music);
    }

}

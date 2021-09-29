package mp3PlayerUsingoop;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


public class Mp3PlayerTest {
    Mp3Player goodboyz;
    Playlist playlist;
    private Music music;

    @BeforeEach
    public void setup(){
        goodboyz = new Mp3Player();
        playlist = new Playlist();
        music = new Music();
    }
    @AfterEach
    void teardown(){

    }
    @Test
    @DisplayName("Mp3 player can turn on Test")
    public void Mp3PlayerCanTurnOnTest(){
        goodboyz.setOn(true);

        assertTrue(goodboyz.getIsOn());
    }

    @Test
    @DisplayName("Mp3 player can turn off Test")
    public void Mp3PlayerCanTurnOffTest(){

            goodboyz.setOn(true);
            assertTrue(goodboyz.getIsOn());

            goodboyz.setOn(false);
            assertFalse(goodboyz.getIsOn());
    }
    @Test
    @DisplayName("Mp3 player has a play list test")
    public void mp3PlayerHasAPlaylistTest(){

        ArrayList<Playlist> playlist = goodboyz.getPlaylist();
        assertNotNull(playlist);
    }

    @Test
    @DisplayName("Mp3 is stopped by default")
    public void mp3IsStoppedByDefaultTest(){
        goodboyz.setOn(true);
        assertSame(MusicState.STOP, playlist.getMusicState());
    }

    @Test
    @DisplayName("Mp3 player can play music test")
    public void mp3PlayerCanPlayMusicTest(){

        goodboyz.setOn(true);
       assertSame(MusicState.STOP, playlist.getMusicState());

       playlist.setMusicState(MusicState.PLAY);

       assertSame(MusicState.PLAY,playlist.getMusicState());

    }

    @Test
    @DisplayName("Mp3 player can increase volume in 5% increment")
    public void mp3PlayerCanIncreaseVolumeTest(){
        goodboyz.setOn(true);
        playlist.increaseVolumeBy5();
        playlist.increaseVolumeBy5();

        assertEquals(15,playlist.getVolume());
    }

    @Test
    @DisplayName("Mp3 volume cannot be increased beyond 100% ")
    public void mp3PlayerCannotIncreaseVolumeBeyond100Test(){
        goodboyz.setOn(true);
        for (int i = 1; i <= 21 ; i++) {
            playlist.increaseVolumeBy5();
        }
        assertEquals(100, playlist.getVolume());
    }

    @Test
    @DisplayName("Mp3 player can pause music test")
    public void mp3PlayerCanPauseMusicTest(){

        goodboyz.setOn(true);
        assertSame(MusicState.STOP, playlist.getMusicState());

        playlist.setMusicState(MusicState.PAUSE);

        assertSame(MusicState.PAUSE,playlist.getMusicState());

    }

    @Test
    @DisplayName("Mp3 player can decrease volume in 5% decrement")
    public void mp3PlayerCanDecreaseMusicTest(){

        goodboyz.setOn(true);
        playlist.increaseVolumeBy5();
        playlist.increaseVolumeBy5();
        playlist.increaseVolumeBy5();

        playlist.decreaseVolume();

        assertEquals(15, playlist.getVolume());
    }


    @Test
    @DisplayName("Mp3 player cannot be decreased beyond 5 % ")
    public void mp3PlayerCannotBeDecreasedBeyondFivePercentTest(){

        goodboyz.setOn(true);
        playlist.increaseVolumeBy5();
        playlist.increaseVolumeBy5();

        for (int i = 1; i <= 4; i++) {
            playlist.decreaseVolume();
        }
        assertEquals(5, playlist.getVolume());
    }


    @Test
    @DisplayName("Mp3 player can play next music ")
    public void mp3PlayerCanPlayNextMusicTest(){

        goodboyz.setOn(true);
        playlist.Mp3PlayerCanPlayNextMusic();
        assertEquals(1,playlist.getNextMusic());
    }


    @Test
    @DisplayName("Mp3 player can play previous music")
    public void mp3PlayerCanPlayPreviousMusicTest(){

        goodboyz.setOn(true);

        playlist.Mp3PlayerCanPlayNextMusic();
        playlist.Mp3PlayerCanPlayNextMusic();
        playlist.Mp3PlayerCanPlayNextMusic();

        playlist.playPreviousMusic();

        assertEquals(2, playlist.getNextMusic());
    }

//    @Test
//    @DisplayName("Mp3 player can play music at random")
//    public void mp3PlayerCanPlayMusicAtRandomTest(){
//
//        goodboyz.setOn(true);
//
//        goodboyz.setMusicState(MusicState.PLAY);
//
//        goodboyz.Mp3PlayerCanPlayNextMusic();
//        goodboyz.Mp3PlayerCanPlayNextMusic();
//
//        //goodboyz.playMusicAtRandom();
//
//        assertNotEquals(3, goodboyz.getNextMusic());
//
//    }

    @Test
    @DisplayName("Mp3 player can add music to playlist")
    public void mp3PlayerCanAddMusicToPlaylistTest(){

        goodboyz.setOn(true);

        //ArrayList<Playlist> playlist = goodboyz.getPlaylist();

        playlist.addMusicToPlaylist(music);
        playlist.addMusicToPlaylist(music);

        assertEquals(2, playlist.getSizeOfPlaylist());

    }

    @Test
    @DisplayName("Mp3 player can remove music from playlist")
    public void mp3PlayerCanRemoveMusicFromPlaylist(){

        goodboyz.setOn(true);

        playlist.addMusicToPlaylist(music);
        playlist.addMusicToPlaylist(music);

        playlist.removeMusicFromPlaylist(music);

        assertEquals(1, playlist.getSizeOfPlaylist());

    }

    @Test
    @DisplayName("Mp3 player cannot perform any function when turned off")
    public void mp3PlayerCannotPerformAnyFunctionWhenTurnedOffTest(){

        goodboyz.setOn(true);

        // when
        goodboyz.setOn(false);
        // assert that
        assertEquals(0, playlist.getSizeOfPlaylist());
        assertEquals(0, playlist.getSizeOfPlaylist());
        assertEquals(0, playlist.getNextMusic());
        assertEquals(5, playlist.getVolume());
        assertSame(MusicState.STOP,playlist.getMusicState());
    }
}

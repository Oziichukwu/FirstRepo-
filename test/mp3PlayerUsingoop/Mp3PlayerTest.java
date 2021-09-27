package mp3PlayerUsingoop;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class Mp3PlayerTest {
    Mp3Player goodboyz;
    Playlist playlist;
    private Music music;

    @BeforeEach
    public void setup(){
        goodboyz = new Mp3Player();
        playlist = goodboyz.getPlaylist();
        music = new Music();
    }
    @AfterEach
    void teardown(){

    }
    @Test
    @DisplayName("Mp3 player can turn on Test")
    public void Mp3PlayerCanTurnOnTest(){

        Mp3Player goodboyz = new Mp3Player();

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

        Playlist playlist = goodboyz.getPlaylist();
        assertNotNull(playlist);
    }

    @Test
    @DisplayName("Mp3 is stopped by default")
    public void mp3IsStoppedByDefaultTest(){

        assertSame(MusicState.STOP, goodboyz.getMusicState());
    }

    @Test
    @DisplayName("Mp3 player can play music test")
    public void mp3PlayerCanPlayMusicTest(){

        goodboyz.setOn(true);
       assertSame(MusicState.STOP, goodboyz.getMusicState());

       goodboyz.setMusicState(MusicState.PLAY);

       assertSame(MusicState.PLAY,goodboyz.getMusicState());

    }

    @Test
    @DisplayName("Mp3 player can increase volume in 5% increment")
    public void mp3PlayerCanIncreaseVolumeTest(){
        goodboyz.setOn(true);
        goodboyz.increaseVolumeBy5();
        goodboyz.increaseVolumeBy5();

        assertEquals(15,goodboyz.getVolume());
    }
    @Test
    @DisplayName("Mp3 volume cannot be increased beyond 100% ")
    public void mp3PlayerCannotIncreaseVolumeBeyond100Test(){
        goodboyz.setOn(true);
        for (int i = 1; i <= 21 ; i++) {
            goodboyz.increaseVolumeBy5();
        }
        assertEquals(100, goodboyz.getVolume());
    }
    @Test
    @DisplayName("Mp3 player can pause music test")
    public void mp3PlayerCanPauseMusicTest(){

        goodboyz.setOn(true);
        assertSame(MusicState.STOP, goodboyz.getMusicState());

        goodboyz.setMusicState(MusicState.PAUSE);

        assertSame(MusicState.PAUSE,goodboyz.getMusicState());

    }
    @Test
    @DisplayName("Mp3 player can decrease volume in 5% decrement")
    public void mp3PlayerCanDecreaseMusicTest(){

        goodboyz.setOn(true);
        goodboyz.increaseVolumeBy5();
        goodboyz.increaseVolumeBy5();
        goodboyz.increaseVolumeBy5();

        goodboyz.decreaseVolume();

        assertEquals(15, goodboyz.getVolume());
    }
    @Test
    @DisplayName("Mp3 player cannot be decreased beyond 5 % ")
    public void mp3PlayerCannotBeDecreasedBeyondFivePercentTest(){

        goodboyz.setOn(true);
        goodboyz.increaseVolumeBy5();
        goodboyz.increaseVolumeBy5();

        for (int i = 1; i <= 4; i++) {
            goodboyz.decreaseVolume();
        }
        assertEquals(5, goodboyz.getVolume());
    }
    @Test
    @DisplayName("Mp3 player can play next music ")
    public void mp3PlayerCanPlayNextMusicTest(){

        goodboyz.setOn(true);
        goodboyz.Mp3PlayerCanPlayNextMusic();
        assertEquals(1,goodboyz.getNextMusic());
    }

    @Test
    @DisplayName("Mp3 player can play previous music")
    public void mp3PlayerCanPlayPreviousMusicTest(){

        goodboyz.setOn(true);

        goodboyz.Mp3PlayerCanPlayNextMusic();
        goodboyz.Mp3PlayerCanPlayNextMusic();
        goodboyz.Mp3PlayerCanPlayNextMusic();

        goodboyz.playPreviousMusic();

        assertEquals(2, goodboyz.getNextMusic());
    }
    @Test
    @DisplayName("Mp3 player can play music at random")
    public void mp3PlayerCanPlayMusicAtRandomTest(){

        goodboyz.setOn(true);

        goodboyz.setMusicState(MusicState.PLAY);

        goodboyz.Mp3PlayerCanPlayNextMusic();
        goodboyz.Mp3PlayerCanPlayNextMusic();

        //goodboyz.playMusicAtRandom();

        assertNotEquals(3, goodboyz.getNextMusic());

    }
    @Test
    @DisplayName("Mp3 player can add music to playlist")
    public void mp3PlayerCanAddMusicToPlaylistTest(){

        goodboyz.setOn(true);

        Playlist playlist = goodboyz.getPlaylist();

        goodboyz.addMusicToPlaylist(music);
        goodboyz.addMusicToPlaylist(music);

        assertEquals(2, goodboyz.getSizeOfPlaylist());

    }

    @Test
    @DisplayName("Mp3 player can remove music from playlist")
    public void mp3PlayerCanRemoveMusicFromPlaylist(){

        goodboyz.setOn(true);

        goodboyz.addMusicToPlaylist(music);
        goodboyz.addMusicToPlaylist(music);

        goodboyz.removeMusicFromPlaylist(music);

        assertEquals(1, goodboyz.getSizeOfPlaylist());
    }
}

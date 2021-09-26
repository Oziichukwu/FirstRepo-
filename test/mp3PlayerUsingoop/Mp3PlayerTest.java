package mp3PlayerUsingoop;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class Mp3PlayerTest {
    Mp3Player goodboyz;
    Playlist playlist;
    @BeforeEach
    public void setup(){
        goodboyz = new Mp3Player();
        playlist = goodboyz.getPlaylist();
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
    @DisplayName("Mp3 can play music test")
    public void mp3PlayerCanPlayMusicTest(){

        goodboyz.setOn(true);
       assertSame(MusicState.STOP, goodboyz.getMusicState());

       goodboyz.setMusicState(MusicState.PLAY);

       assertSame(MusicState.PLAY,goodboyz.getMusicState());

    }


}

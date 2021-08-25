import chapterThree11.Mp3;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Mp3Test {

    @Test
    public void mp3CanTurnOnTest(){

        // given that

        Mp3 sony = new Mp3();

        // when
        sony.setOn(true);

        // assert that
        assertTrue(sony.getIson());
    }

    @Test
    public void mp3CanTurnOffTest(){
        // given that
        Mp3 sony = new Mp3();
        sony.setOn(true);

        // when
        sony.setOn(false);

        // assert that
        assertFalse(sony.getIson());
    }

    @Test
    public void mp3CanIncreaseVolumeTest(){
        // given that

        Mp3 sony = new Mp3();
        sony.setOn(true);
        // when
        sony.increaseVolume();
        sony.increaseVolume();
        sony.increaseVolume();
        // assert
        assertEquals(3, sony.getVolume());
    }

    @Test
    public void mp3CanDecreaseVolumeTest(){

        // given that
        Mp3 sony = new Mp3();
        sony.setOn(true);
        sony.increaseVolume();
        sony.increaseVolume();

        // when
        sony.decreaseVolume();

        // assert that
        assertEquals(1, sony.getVolume());
    }

    @Test

    public void mp3CanChangeMusicTest(){

        // given that
        Mp3 sony = new Mp3();
        sony.setOn(true);
        // when
        sony.changeSong();
        sony.changeSong();
        sony.changeSong();
        // assert that
        assertEquals(3, sony.getController());
    }

    @Test
    public  void mp3CanPlayMusicTest(){

        // given that

        Mp3 sony = new Mp3();
        sony.setOn(true);

        // when
        sony.play(true);

        // assert that

        assertTrue(sony.getPlayer());

    }

    @Test
    public void mp3CanPauseMusic(){

        // given that
        Mp3 sony = new Mp3();
        sony.setOn(true);
        sony.play(true);
        // when
        sony.play(false);
        // assert that
        assertFalse(sony.getPlayer());
    }
}

import chapterThree.Television;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TelevisionTest {

    @Test
    public void televisionCanTurnOnTest() {

        // given that

        Television lg = new Television();

        // when

        lg.setOn(true);

        // assert that

        assertTrue(lg.getIson());
    }

    @Test
    public void televisionCanTurnOffTest() {

        // given that
        Television lg = new Television();
        lg.setOn(true);

        // when

        lg.setOn(false);

        // assert that

        assertFalse(lg.getIson());
    }

    @Test
    public void televisionCanIncreaseVolumeTest() {

        // given that

        Television lg = new Television();
        lg.setOn(true);

        // when

        lg.increaseVolume();

        // asseert that

        assertEquals(1, lg.getVolume());
    }
    @Test
    public void televisionCanDecreaseVolumeTest(){

        // given that

        Television lg = new Television();
        lg.setOn(true);
        lg.increaseVolume();
        lg.increaseVolume();

        // when

        lg.decreaseVolume();

        // assert that

        assertEquals(1, lg.getVolume());
    }
    @Test
    public void televisionCanChangechannelTest(){

        // given that

        Television lg = new Television();
        lg.setOn(true);

        // when

        lg.changeChannel(10);

        // assert that

        assertEquals(10, lg.getChannel());
    }
    @Test
    public void televisionCannotGoBeyondChannel200Test(){

        // given that

        Television lg = new Television();
            lg.setOn(true);
                lg.changeChannel(45);

        // when

        lg.changeChannel(155);

        // assert that

        assertEquals(45, lg.getChannel());
    }

    @Test
    public void televisionCannotGoBelowChannel0Test(){

    // given that
        Television lg = new Television();
            lg.setOn(true);
                lg.changeChannel(56);

    // when
        lg.changeChannel(-5);

     // assert that

     assertEquals(56, lg.getChannel());
    }


}
package mp3PlayerUsingoop;

import chapterThree11.Mp3;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class Mp3Test {
    Mp3Player goodboyz;
    @BeforeEach
    public void setup(){

        goodboyz = new Mp3Player();
    }
    @AfterEach
    void teardown(){
    }
    @Test
    @DisplayName("Mp3 player can turn on Test")
    public void Mp3PlayerCanTurnOnTest(){

        Mp3 goodboyz = new Mp3();

        goodboyz.setOn(true);

        assertTrue(goodboyz.getIson());
    }
}

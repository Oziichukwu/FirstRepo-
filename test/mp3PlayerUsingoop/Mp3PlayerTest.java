package mp3PlayerUsingoop;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class Mp3PlayerTest {
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

        Mp3Player goodboyz = new Mp3Player();

        goodboyz.setOn(true);

        assertTrue(goodboyz.getIson());
    }

    @Test
    @DisplayName("Mp3 player can turn off Test")
    public void Mp3PlayerCanTurnOffTest(){


    }
}

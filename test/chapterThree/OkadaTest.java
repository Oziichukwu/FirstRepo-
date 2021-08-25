 import chapterThree11.Okada;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OkadaTest {

    Okada sony;

    @BeforeEach
    public void setup(){

        sony = new Okada(false, 16, 0);
    }

    @AfterEach
    void teardown(){
    }

    @Test
    public void bikeCanTurnOnTest(){

        assertFalse(false);
        sony.setOn(true);
        assertTrue(sony.getIson());
    }

    @Test
    public void bikeCanTurnOffTest(){

        assertFalse(sony.getIson());
        sony.setOn(true);
        sony.setOn(false);
        assertFalse(sony.getIson());
    }

    @Test
    public void bikeCanAccelerateViaGearOneTest(){

        sony.setOn(true);
        assertTrue(sony.getIson());
        sony.accelerate();
        assertEquals(17, sony.getspeed());
        assertEquals(1, sony.getgear());
    }

    @Test
    public void bikeCanAccelerateViaGearTwoTest(){

        sony.setOn(true);
        assertTrue(sony.getIson());
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();

       assertEquals(21, sony.getspeed());
    }

    @Test
    public void bikeCanAccelerateViaGearThreeTest(){

        sony.setOn(true);
        assertTrue(sony.getIson());
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        assertEquals(31, sony.getspeed());
    }

    @Test
    public void bikeCanAccelerateViaGearFourTest(){

        sony.setOn(true);
        assertTrue(sony.getIson());
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        assertEquals(43, sony.getspeed());
    }
    @Test
    public void bikeCanDecelerateViaGearOne(){

        sony.setOn(true);
        assertTrue(sony.getIson());
        sony.decelerate();
        assertEquals(15, sony.getspeed());
    }

    @Test
    public void bikeCanDecelerateViaGearTwoTest(){

        sony.setOn(true);
        assertTrue(sony.getIson());
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.decelerate();
        assertEquals(19, sony.getspeed());
    }

    @Test
    public void bikeCanDecelerateViaGearThreeTest(){

        sony.setOn(true);
        assertTrue(sony.getIson());
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.decelerate();

        assertEquals(28, sony.getspeed());
    }

    @Test

    public void bikeCanDecelerateViaGearFourTest(){

        sony.setOn(true);
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.decelerate();
        assertEquals(37, sony.getspeed());
    }

    @Test
    public void bikeCanChangeGearAutomaticallyTest1() {

        sony.setOn(true);
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();

        assertEquals(1, sony.getgear());
    }

    @Test
    public void bikeCanChangeGearAutomaticallyToGearTwoTest(){

            sony.setOn(true);
            sony.accelerate();
            sony.accelerate();
            sony.accelerate();
            sony.accelerate();
            sony.accelerate();
        assertEquals(2, sony.getgear());
    }

    @Test
    public void bikeCanChangeGearAutomaticallyToGearThreeTest(){

        sony.setOn(true);
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        assertEquals(3,sony.getgear());
    }

    @Test
    public void bikeCanChangeGearAutomaticallyToGearFourTest(){

        sony.setOn(true);
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        sony.accelerate();
        assertEquals(43, sony.getspeed());
        assertEquals(4, sony.getgear());

    }
}

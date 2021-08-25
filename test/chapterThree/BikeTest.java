
import chapterThree11.Bike;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;


public class BikeTest {


    @Test
    public void bikeCanTurnOnTest(){

        Bike bajaj = new Bike();
        bajaj.setOn(true);
        assertTrue(bajaj.getIson());
    }

    @Test
    public void bikeCanTurnOffTest(){

        Bike bajaj = new Bike();
        bajaj.setOn(true);
        bajaj.setOn(false);
        assertFalse(bajaj.getIson());
    }

    @Test
    public void bikeCanAccelerateViaGearOneTest(){

        Bike bajaj = new Bike();
        bajaj.setOn(true);
        bajaj.accelerate(15, 1);
        assertEquals(16, bajaj.getspeed());
    }

    @Test
    public void bikeCanAccelerateViaGearTwoTest(){

        Bike bajaj = new Bike();
        bajaj.setOn(true);
        bajaj.accelerate(21, 2);
        assertEquals(23 , bajaj.getspeed());
        assertEquals(2, bajaj.getGear());
    }

    @Test
    public void bikeCanAccelerateViaGearThreeTest(){

        Bike bajaj = new Bike();
        bajaj.setOn(true);
        bajaj.accelerate(35, 3);
        assertEquals(38, bajaj.getspeed());
    }

    @Test
    public void bikeCanAccelerateViaGearFourTest(){

        Bike bajaj = new Bike();
        bajaj.setOn(true);
        bajaj.accelerate(44, 4);
        assertEquals(48, bajaj.getspeed());
    }

    @Test
    public void bikeCanDecelerateViaGearOneTest(){

        Bike bajaj = new Bike();
        bajaj.setOn(true);
        bajaj.decelerate(15, 1);
        assertEquals(14, bajaj.getspeed());
    }

    @Test
    public void bikeCanDecelerateViaGearTwoTest(){

        Bike bajaj = new Bike();
        bajaj.setOn(true);
        bajaj.decelerate(26,2);
        assertEquals(24, bajaj.getspeed());
    }

    @Test
    public void bikeCanDecelerateViaGearThreeTest(){

        Bike bajaj = new Bike();
        bajaj.setOn(true);
        bajaj.decelerate(38, 3);
        assertEquals(35, bajaj.getspeed());
    }

    @Test
    public void bikeCanDecelerateViaGearFourTest(){

        Bike bajaj = new Bike();
        bajaj.setOn(true);
        bajaj.decelerate(48,4);
        assertEquals(44, bajaj.getspeed());
    }

    @Test
    public void bikeCanSwitchGearAutomaticallyWhenAcceleratingTest(){

        Bike bajaj = new Bike();
        bajaj.setOn(true);
        bajaj.accelerate(16,1);
        bajaj.accelerate(21,2);
        assertEquals(2, bajaj.getGear());
    }

    @Test
    public void bikeCanSwitchGearAutomaticallyWhenAccelerating2Test(){

        Bike bajaj = new Bike();
        bajaj.setOn(true);
        bajaj.accelerate(24,2);
        bajaj.accelerate(32,3);
        assertEquals(3, bajaj.getGear());
    }

    @Test
    public void bikeCanSwitchGearAutomaticallyWhenAccelerating3Test(){

        Bike bajaj = new Bike();
        bajaj.setOn(true);
        bajaj.accelerate(35, 3);
        bajaj.accelerate(42,4);
        assertEquals(4, bajaj.getGear());
    }

    @Test
    public void bikeCanSwitchGearAutomaticallyWhenDeceleratingTest(){

        Bike bajaj = new Bike();
        bajaj.setOn(true);


    }

}

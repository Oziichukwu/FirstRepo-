import chapterThree.Bike;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {

    @Test
    public void bikeCanStartTest() {

        // given that
        Bike suzuki = new Bike();

        // when

        suzuki.setOn(true);

        // assert that

        assertTrue(suzuki.getIson());
    }

    @Test
    public void bikeCanTurnOffTest() {

        // given that

        Bike suzuki = new Bike();
        suzuki.setOn(true);

        // when

        suzuki.setOn(false);

        // assert that
        assertFalse(suzuki.getIson());
    }

    @Test
    public void bikeCanAccelerateOneTest() {

        // given that

        Bike suzuki = new Bike();
        suzuki.setOn(true);

        // when
        suzuki.accelerateOne(15);

        // assert that

        assertEquals(16, suzuki.getspeed());
    }

    @Test
    public void bikeCanAccelerateTwoTest() {

        // given that

        Bike suzuki = new Bike();
        suzuki.setOn(true);

        // when

        suzuki.accelerateTwo(24);

        // assert that

        assertEquals(26, suzuki.getspeed());
    }

    @Test
    public void bikeCanAccelerateThreeTest() {

        // given that

        Bike suzuki = new Bike();
        suzuki.setOn(true);

        // when

        suzuki.accelerateThree(35);

        // assert that

        assertEquals(38, suzuki.getspeed());
    }

    @Test
    public void bikeCanAccelerateFour() {

        // given that

        Bike suzuki = new Bike();
        suzuki.setOn(true);

        // when

        suzuki.accelerateFour(40);

        // assert that

        assertEquals(44, suzuki.getspeed());
    }

    @Test
    public void bikeCanDecelerateOneTest() {

        // given that

        Bike suzuki = new Bike();
        suzuki.setOn(true);

        // when
        suzuki.decelerateOne(15);

        // assert that

        assertEquals(14, suzuki.getspeed());
    }

    @Test
    public void bikeCanDecelerateTwoTest() {

        // given that

        Bike suzuki = new Bike();
        suzuki.setOn(true);

        // when

        suzuki.decelerateTwo(24);

        // assert that

        assertEquals(22, suzuki.getspeed());
    }

    @Test
    public void bikeCanDecelerateThreeTest() {

        // given that

        Bike suzuki = new Bike();
        suzuki.setOn(true);

        // when

        suzuki.decelerateThree(35);

        // assert that

        assertEquals(32, suzuki.getspeed());
    }

    @Test
    public void bikeCanDecelerateFourTest() {

        // given that

        Bike suzuki = new Bike();
        suzuki.setOn(true);

        // when

        suzuki.decelerateFour(44);

        // assert that

        assertEquals(40, suzuki.getspeed());
    }

    @Test
    public void bikeCanChangeGearAutomatically() {

        // given that

        Bike suzuki = new Bike();
        suzuki.setOn(true);

        // when

        suzuki.gear(1, 20);

        // assert that

        assertEquals(1, suzuki.getGear());
    }

    @Test
    public void bikeCanChangeGearAutomatically1() {

        // given that

        Bike suzuki = new Bike();
        suzuki.setOn(true);

        // when
        suzuki.gear(2, 25);

        // assert that

        assertEquals(2, suzuki.getGear());
    }

    @Test
    public void bikeCanChangeGearAutomatically2() {

        // given that

        Bike suzuki = new Bike();
        suzuki.setOn(true);

        // when
        suzuki.gear(3, 32);

        // assert that

        assertEquals(3, suzuki.getGear());
    }

    @Test
 public void bikeCanChangeGearAutomatically3(){

        // given that

        Bike suzuki = new Bike();
        suzuki.setOn(true);

        // when

        suzuki.gear(4,42);

        // assert that

        assertEquals(4, suzuki.getGear());
    }
}
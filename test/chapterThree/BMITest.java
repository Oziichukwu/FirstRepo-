import chapterThree11.BMI;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class BMITest {

    BMI myBMI;

    @BeforeEach
    public void setup(){

         myBMI = new BMI(0, 0);
    }

    @AfterEach
    void teardown(){
    }

    @Test
    public void userCanInputWeightTest(){

        myBMI.setWeight(34);

        assertEquals(34, myBMI.getWeight());
    }

    @Test

    public void userCannotInputNegativeValueForWeight(){

        myBMI.setWeight(-25);

        assertEquals(0, myBMI.getWeight());
    }

    @Test

    public void userCanInputHeightTest(){

        myBMI.setHeight(25);

        assertEquals(25, myBMI.getHeight());

    }

    @Test

    public void userCannotInputNegativeValueForHeight(){


        myBMI.setHeight(-45);

        assertEquals(0, myBMI.getHeight());
    }

    @Test
    public void UserCanCheckBMITest(){

        myBMI.setHeight(24);

        myBMI.setWeight(45);

        myBMI.setBMI();

        assertEquals(54, myBMI.getBMI());

        System.out.printf("Your body mass index is %f%n",myBMI.getBMI());

    }

    @Test

    public void UserCannotCheckBMIWhenNegativeValuesAreInputtedAsWeightAndHeight(){

        myBMI.setHeight(-24);

        myBMI.setWeight(-55);

        myBMI.setBMI();

        assertEquals(0.0, myBMI.getBMI());

        System.out.printf("Your body mass index is %f%n",myBMI.getBMI());

    }
}

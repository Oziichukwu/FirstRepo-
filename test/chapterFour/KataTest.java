package chapterFour;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class KataTest {

    @Test
    public void calculateFactorialTest(){

        Kata myKata = new Kata();

        int result = myKata.calculatefactorial(4);

        assertEquals(24, result);

    }

@Test
public void calculatepriceOfOneToFourCopiesTest(){

    Kata myKata = new Kata();

    int price = myKata.calculatePrice1(2);

    assertEquals(3000, price);
}

@Test

    public void calculatePriceOfFiveToNineCopies(){

        Kata myKata = new Kata();

        int price = myKata.calculatePrice1(8);
        assertEquals(11200, price);
}

    @Test

    public void calculatePriceOfTenToTwentynineCopies(){

        Kata myKata = new Kata();

        int price = myKata.calculatePrice1(21);
        assertEquals(25200, price);
    }
    @Test

    public void calculatePriceOfThrityToFortyNineCopies(){

        Kata myKata = new Kata();

        int price = myKata.calculatePrice1(35);
        assertEquals(38500, price);
    }

    @Test

    public void calculatePriceOffiftyToNintyNineCopies(){

        Kata myKata = new Kata();

        int price = myKata.calculatePrice1(52);
        assertEquals(52000, price);
    }

    @Test

    public void calculatePriceOfAHundredToOneNintyNineCopies(){

        Kata myKata = new Kata();

        int price = myKata.calculatePrice1(120);
        assertEquals(108000, price);
    }
    @Test

    public void calculatePriceOfAboveTwoHundredCopies(){

        Kata myKata = new Kata();

        int price = myKata.calculatePrice1(200);
        assertEquals(160000, price);
    }

    @Test
    void twelveDaysOfChristmasSongTest(){

        Kata myKata = new Kata();

        String song = myKata.twelveDaysOfChrismasSong(3);

       System.out.println(song);

       assertEquals(
      """
      On the Third day of Christmas 
      My true love sent to me:
      Three French Hen
      Two Turtle Dove,
      And A partridge in a Pear Tree
                """, song);


    }

}

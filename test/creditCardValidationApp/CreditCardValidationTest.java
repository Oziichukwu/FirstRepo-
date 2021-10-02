package creditCardValidationApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class CreditCardValidationTest {
    CreditCard creditCard;
    @BeforeEach
    void setUp(){
        creditCard = new CreditCard();
    }
    @Test
    @DisplayName("invalid Prefix When CreditCard Number Starts With Numbers Other Than 4 5 6 And 37 Test")
    public void invalidPrefixWhenCreditCardNumberStartsWithNumbersOtherThan456And37Test(){
        assertFalse(creditCard.validPrefix("8988576018402626"));
    }

    @Test
    public void validPrefixWhenCreditCardNumberStartsWith4Test(){
        assertTrue(creditCard.validPrefix("4388576018402626"));
    }
    @Test
    public void ValidWhenCreditCardNumberStartsWith5Test(){
        assertTrue(creditCard.validPrefix("5388576018402626"));
    }
    @Test
    public void validPrefixWhenCreditCardNumberStartsWith37Test(){
        assertTrue(creditCard.validPrefix("3788576018402626"));
    }
    @Test
    public void validPrefixWhenCreditCardNumberStartsWith6Test(){
        assertTrue(creditCard.validPrefix("6788576018402626"));
    }
    @Test
    @DisplayName("creditCard Is Valid When The CreditCard Number Is 16 Digits Test ")
    public void creditCardIsValidWhenTheCreditCardNumberIs16DigitsTest(){
        assertTrue(creditCard.validLength("4388576018402626"));
    }
    @Test
    @DisplayName("creditCard Is Valid When The CreditCard Number Is 13 Digits Test ")
    public void creditCardIsValidWhenTheCreditCardNumberIs13DigitsTest(){
        assertTrue(creditCard.validLength("4388576018402"));
    }
    @Test
    @DisplayName("creditCard Is Valid When The CreditCard Number Is 14 Digits Test ")
    public void creditCardIsValidWhenTheCreditCardNumberIs14DigitsTest(){
        assertTrue(creditCard.validLength("43885760184026"));
    }
    @Test
    @DisplayName("creditCard Is Valid When The CreditCard Number Is 15 Digits Test ")
    public void creditCardIsValidWhenTheCreditCardNumberIs15DigitsTest(){
        assertTrue(creditCard.validLength("438857606184026"));
    }
    @Test
    @DisplayName("creditCard Number Cannot be Below 13 Digits Test ")
    public void creditCardNumberCannotBeBelow13DigitsTest(){
        assertFalse(creditCard.validLength("438857601840"));
    }
    @Test
    @DisplayName("creditCard Number Cannot be Above 16 Digits Test ")
    public void creditCardNumberCannotBeAbove16DigitsTest(){
        assertFalse(creditCard.validLength("43885760198978940"));
    }
    @Test
    @DisplayName("credit card can double all even placed numbers from right to left when the length is valid")
    public void creditCardCanDoubleAllEvenPlacedNumbersTest(){
        assertEquals(40, creditCard.sumOfDoubleEvenPlace("4388576018402687"));
    }
    @Test
    @DisplayName("credit card can sum all doubled even placed numbers from right to left when the length of card is 16")
    public void creditCardCanSumAllDoubledEvenPlacedNumbersTest(){
        assertEquals(40, creditCard.sumOfDoubleEvenPlace("4388576018402687"));
    }
    @Test
    @DisplayName("credit card can sum all doubled even placed numbers from right to left when the length of card is 15")
    public void creditCardCanSumAllDoubledEvenPlacedNumbersWhenCardNumberIs15Test(){
        assertEquals(28, creditCard.sumOfDoubleEvenPlace("438857601840268"));
    }
    @Test
    @DisplayName("credit card can sum all doubled even placed numbers from right to left when the length of card is 14")
    public void creditCardCanSumAllDoubledEvenPlacedNumbersWhenCardNumberIs14Test(){
        assertEquals(38, creditCard.sumOfDoubleEvenPlace("48857601842687"));
    }
    @Test
    @DisplayName("credit card can sum all doubled even placed numbers from right to left when the length of card is 16")
    public void creditCardCanSumAllDoubledEvenPlacedNumbersWhenCardNumberIs13Test(){
        assertEquals(37, creditCard.sumOfDoubleEvenPlace("4388578402687"));
    }
    @Test
    @DisplayName("credit card can double all odd placed numbers from right to left when the length is valid")
    public void creditCardCanDoubleAllOddPlacedNumbersTest(){
        assertEquals(33, creditCard.sumOfDoubleOddPlace("4388576018402687"));
    }
    @Test
    @DisplayName("credit card can double all odd placed numbers from right to left when the length is valid")
    public void creditCardCanDoubleAllOddPlacedNumbersWhenCardHasALengthOf15Test(){
        assertEquals(37, creditCard.sumOfDoubleOddPlace("438857601842687"));
    }
    @Test
    @DisplayName("credit card can double all odd placed numbers from right to left when the length is valid")
    public void creditCardCanDoubleAllOddPlacedNumbersWhenCardHasALengthOf14Test(){
        assertEquals(38, creditCard.sumOfDoubleOddPlace("4388761842687"));
    }
    @Test
    @DisplayName("credit card can double all odd placed numbers from right to left when the length is valid")
    public void creditCardCanDoubleAllOddPlacedNumbersWhenCardHasALengthOf13Test(){
        assertEquals(34, creditCard.sumOfDoubleOddPlace("438857842687"));
    }


}

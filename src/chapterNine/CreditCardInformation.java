package chapterNine;

public class CreditCardInformation extends BillingInformation{

    private int Cvv;
    private int cardExpirationYear;
    private int creditCardNumber;
    private String cardName;
    private String cardType;

//    public CreditCardInformation(int cvv, int cardExpirationYear, int creditCardNumber,
//                                 String cardName, String cardType) {
//
//        Cvv = cvv;
//        this.cardExpirationYear = cardExpirationYear;
//        this.creditCardNumber = creditCardNumber;
//        this.cardName = cardName;
//        this.cardType = cardType;
//    }


    public enum CardType {

        MASTERCARD, VISACARD, VERVE, AMERICANEXPRESS;
    }

}

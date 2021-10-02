package creditCardValidationApp;

public class CreditCard {

    public boolean validPrefix(String creditCardNumber) {
        if (creditCardNumber.charAt(0) == '4') {
            return true;
        }
        if (creditCardNumber.charAt(0) == '5') {
            return true;
        }
        if (creditCardNumber.charAt(0) == '3' && creditCardNumber.charAt(1) == '7') {
            return true;
        }
        if (creditCardNumber.charAt(0) == '6') {
            return true;
        } else {
            return false;
        }
    }


    public boolean validLength(String creditCardNumber) {
        if (creditCardNumber.length() == 16) {
            return true;
        }
        if (creditCardNumber.length() == 13){
            return true;
        }
        if (creditCardNumber.length() == 14 ){
            return true;
        }
        if (creditCardNumber.length() == 15 ){
            return true;
        }
        else {
            return false;
        }
    }

    public int sumOfDoubleEvenPlace(String creditCardNumber) {
        int sumOfEvenNumbers = 0;

        for (int i = creditCardNumber.length()-2; i >= 0; i-=2) {

            int sumOfDoubleEvenPlaceNumbers = doubleEvenPlaceNumbers(creditCardNumber, i);

            if (sumOfDoubleEvenPlaceNumbers > 9){
                sumOfEvenNumbers += (sumOfDoubleEvenPlaceNumbers/10) + (sumOfDoubleEvenPlaceNumbers % 10);
            }
            else {
                sumOfEvenNumbers += sumOfDoubleEvenPlaceNumbers;
            }
        }
        return sumOfEvenNumbers;
    }

    private int doubleEvenPlaceNumbers(String creditCardNumber, int i) {
        int digitValueOfCreditCard = Integer.parseInt(String.valueOf(creditCardNumber.charAt(i)));

        return digitValueOfCreditCard * 2;
    }

    public int sumOfDoubleOddPlace(String creditCardNumber) {
        int sumOfOddNumbers = 0;

        for (int i = creditCardNumber.length()-1; i >= 0; i-=2) {
            int digitValueOfCardNumber = Integer.parseInt(String.valueOf(creditCardNumber.charAt(i)));
              int sumOfDoubledOddNumbers  = digitValueOfCardNumber * 2;
              if (sumOfDoubledOddNumbers > 9){
                  sumOfOddNumbers += (sumOfDoubledOddNumbers / 10) + (sumOfDoubledOddNumbers % 10);
              }
              else
                  sumOfOddNumbers += sumOfDoubledOddNumbers;
        }

        return sumOfOddNumbers;
    }


}
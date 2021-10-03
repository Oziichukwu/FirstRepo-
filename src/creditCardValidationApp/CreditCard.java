package creditCardValidationApp;

public class CreditCard {

    public boolean validPrefix(String creditCardNumber) { return validatePrefixOfCreditCard(creditCardNumber); }

    public boolean validLength(String creditCardNumber) { return validateSizeOfCreditCard(creditCardNumber); }

    public int sumOfDoubleEvenPlace(String creditCardNumber) {
        int sumOfEvenNumbers = 0;
        for (int i = creditCardNumber.length()-2; i >= 0; i-=2) { int sumOfDoubleEvenPlaceNumbers = doubleEvenPlaceNumbers(creditCardNumber, i);
            if (sumOfDoubleEvenPlaceNumbers > 9) sumOfEvenNumbers += (sumOfDoubleEvenPlaceNumbers/10) + (sumOfDoubleEvenPlaceNumbers % 10);
            else sumOfEvenNumbers += sumOfDoubleEvenPlaceNumbers;
        }
        return sumOfEvenNumbers;
    }

    public int sumOfDoubleOddPlace(String creditCardNumber) {
        int sumOfOddNumbers = 0;
        for (int i = creditCardNumber.length()-1; i >= 0; i-=2) sumOfOddNumbers = convertStringToInteger(creditCardNumber, sumOfOddNumbers, i);
        return sumOfOddNumbers;
    }

    public boolean isValid(int sumOfDoubleEvenPlaceValues, int sumOfDoubleOddPlaceValues) {
        return (sumOfDoubleEvenPlaceValues + sumOfDoubleOddPlaceValues) % 10 == 0;
    }

    private int convertStringToInteger(String creditCardNumber, int sumOfOddNumbers, int i) {
        int digitValueOfCardNumber = Integer.parseInt(String.valueOf(creditCardNumber.charAt(i)));
        sumOfOddNumbers += digitValueOfCardNumber;
        return sumOfOddNumbers;
    }

    private int doubleEvenPlaceNumbers(String creditCardNumber, int i) {
        int digitValueOfCreditCard = Integer.parseInt(String.valueOf(creditCardNumber.charAt(i)));
        return digitValueOfCreditCard * 2;
    }

    private boolean validateSizeOfCreditCard(String creditCardNumber) {
        if (creditCardNumber.length() == 16) {
            return true;
        }
        if (creditCardNumber.length() == 13){
            return true;
        }
        if (creditCardNumber.length() == 14 ){
            return true;
        }
        return creditCardNumber.length() == 15;
    }

    private boolean validatePrefixOfCreditCard(String creditCardNumber) {
        if (creditCardNumber.charAt(0) == '4') {
            return true;
        }
        if (creditCardNumber.charAt(0) == '5') {
            return true;
        }
        if (creditCardNumber.charAt(0) == '3' && creditCardNumber.charAt(1) == '7') {
            return true;
        }
        return creditCardNumber.charAt(0) == '6';
    }
}

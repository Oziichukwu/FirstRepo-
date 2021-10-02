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
        if (creditCardNumber.length() == 14){
            return true;
        }
        if (creditCardNumber.length() == 15){
            return true;
        }
        else {
            return false;
        }
    }
}
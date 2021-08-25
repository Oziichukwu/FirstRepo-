package chapterThree11;

public class AccountOne {

    private int balance;


    public int getBalance() {

        return balance;

    }


    public void deposit(int amountToDeposit) {

        if (amountToDeposit > 0)

            balance = balance + amountToDeposit;
    }

    public void withdraw(int amountToWithdraw, int pin) {

        if ( amountToWithdraw <= balance && pin == 2225 )

        balance = balance - amountToWithdraw;

    }
}
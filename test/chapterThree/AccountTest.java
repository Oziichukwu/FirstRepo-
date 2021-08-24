package chapterThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {

    @Test
    public void accountCanDepositTest(){
        // given -- create a secnero

        Account goodnewsAccount = new Account();

        // when -- when a change has occured then do x, y, z

        goodnewsAccount.deposit(400);

        // check -- check or confirm that x, y, z, has been done

        int goodnewsBalance = goodnewsAccount.getBalance();

        assertEquals(400,goodnewsBalance);

    }
    @Test
    public void accountCanAcceptDoubleDeposit(){
        Account goodnewAccount = new Account();

        goodnewAccount.deposit(5000);

        goodnewAccount.deposit(1000);

        int goodnewsBalance = goodnewAccount.getBalance();
        assertEquals(6000,goodnewsBalance );



    }

    @Test
    public void accountCannotAcceptNegativeAmount(){

        Account goodnewsAccount = new Account();

        goodnewsAccount.deposit(1000);

        goodnewsAccount.deposit(-2000);

        int goodnewsBalance = goodnewsAccount.getBalance();
        assertEquals(1000, goodnewsBalance);
    }



    @Test
    public void accountCanWithdrawTest(){

     Account goodnewsAccount = new Account();

     goodnewsAccount.deposit(10000);

     goodnewsAccount.withdraw(4000, 2225);

     int goodnewsBalance = goodnewsAccount.getBalance();
     assertEquals(6000, goodnewsBalance);

    }


    @Test
    public void accountCannotWithdrawWithoutPin(){

        Account goodnewsAccount = new Account();

        goodnewsAccount.deposit(20000);

        goodnewsAccount.withdraw(15000, 2265);

        int goodnewsBalance = goodnewsAccount.getBalance();
        assertEquals(20000, goodnewsBalance);


    }

    @Test
    public void accountCannotWithdrawMoreThanBalance(){

        Account goodnewsAccount = new Account();

        goodnewsAccount.deposit(20000);

        goodnewsAccount.withdraw(25000, 2225);

        int goodnewsBalance = goodnewsAccount.getBalance();
        assertEquals(20000, goodnewsBalance);



    }
}
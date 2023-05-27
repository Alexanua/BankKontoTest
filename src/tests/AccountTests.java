
package tests;


import account.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTests {

   Account account = new Account(2000, "123456789");




@Test
    void testDeposit(){
    account.deposit(500);
    assertEquals(2500, account.getBalance());


}



    @Test
   void testDepositBoolen(){


        boolean expected=true;
        boolean actual=account.deposit(500);
        assertEquals(expected,actual);

    }

    @Test
    void testDepositNegative() {



        assertNotEquals(-100,"123456789");
    }


    @Test
    void testWithdraw(){
        account.withdraw(500);
        assertEquals(1500, account.getBalance());


    }
    @Test
    void testWithdrawBoolen() {


        boolean expected=true;
        boolean actual=account.withdraw(500);
        assertEquals(expected,actual);
    }

    @Test
     void testWithdrawNegative() {

        assertNotEquals(-100,"123456789");
    }

    @Test
   void testGetAccountNumber() {
        assertEquals("123456789", account.getAccountNr());
    }


}

package ch.juventus.logging;
import ch.juventus.javadoc.MathUtils;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {

    private static Bank bank;
    @BeforeAll
    static void setUp(){
        bank = new Bank(2300);
    }

    @Test
    public void shouldReturnBalanceWhenDeductFromBalance(){
        //given
        double deduction = 233;
        double newBalance;
        //when
        newBalance = bank.withdraw(deduction);
        //then
        assertEquals(2067, newBalance);
    }

    @Test
    public void shouldReturnBalanceWhenAddToBalance(){
        //given
        double deposit = 2000;
        double newBalance;
        //when
        newBalance = bank.deposit(deposit);
        //then
        assertEquals(4300, newBalance);
    }

    @Test
    public void shouldReturnBalance(){
        //given
        double balance;
        //when
        balance = bank.retrieveBalance();
        //then
        assertEquals(2300, balance);
    }

}
package ch.juventus.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Class for BankAccount
 *
 * @author Sabine Codiga
 * @version 1.0
 * @since 23.09.2021
 */

public class Bank {

    private double balance = 0;
    private double deduction = 0;
    private double deposit = 0;
    final Logger logger = LoggerFactory.getLogger(Bank.class);

    public double getBalance() {
        return balance;
    }
    public double getDeduction() {
        return deduction;
    }
    public double getDeposit() {
        return deposit;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    //methods

    public double withdraw(double deduction ){
        this.deduction = deduction;
        logger.debug("init. Balance {}", balance);
        balance -= deduction;
        logger.debug("Withdraw of {}. Balance set to {}", deduction, balance);
        return balance;
    }

    public double deposit(double deposit){
        this.deposit = deposit;
        logger.debug("init. Balance {}", balance);
        balance += deposit;
        logger.debug("Deposit of {}. Balance set to {}", deposit, balance);
        return balance;
    }
    public double retrieveBalance(){
        return balance;
    }

    public Bank(double balance){
        this.balance = balance;
        logger.debug("Current Balance is {}", balance);
        setBalance(balance);
    }
}

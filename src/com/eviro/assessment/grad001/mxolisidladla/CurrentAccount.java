package com.eviro.assessment.grad001.mxolisidladla;

import java.math.BigDecimal;
import java.io.*;

public class CurrentAccount implements AccountService {
    //private data member
    private String accountNumber;
    private BigDecimal balance;
    private BigDecimal overdraft;

    public CurrentAccount(BigDecimal initial_balance, BigDecimal overdraft) {
        balance = initial_balance;
        this.overdraft = overdraft;
    } // contractor

    @Override
    public void withdraw(String accountNum, BigDecimal amountToWithdraw) {
        accountNumber = accountNum;

        System.out.println("Withdrawal: -R" + amountToWithdraw);
        System.out.println("From Enviro-Bank's Current Account: " + accountNumber);

        BigDecimal availableBalance = overdraft.add(balance);
        System.out.println("Avial: " + availableBalance);

        int res = amountToWithdraw.compareTo(availableBalance);

        try {
            withdrawalAmount(res); // check if u have sufficient balance

            System.out.println("Your new balance: R" + balance.subtract(amountToWithdraw));

        } catch (WithdrawalAmountTooLargeException e) {
            System.err.print(e);
        }

        System.out.println();
    } // method withdraw

    public int withdrawalAmount(int a) throws WithdrawalAmountTooLargeException {
        if (a == 1)
            throw new WithdrawalAmountTooLargeException("Insufficient funds.");
        else
            return a;
    } // method withdrawalAmount
} // class CurrentAccount
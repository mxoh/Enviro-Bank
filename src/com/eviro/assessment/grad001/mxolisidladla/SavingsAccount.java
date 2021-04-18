package com.eviro.assessment.grad001.mxolisidladla;

import java.math.BigDecimal;

public class SavingsAccount implements AccountService {
    //private data member
    private BigDecimal balance;

    public SavingsAccount(BigDecimal initial_balance) {
        balance = initial_balance;
    } // contractor

    @Override
    public void withdraw(String accountNum, BigDecimal amountToWithdraw) {
        System.out.println("Withdrawal: -R" + amountToWithdraw);
        System.out.println("From Enviro-Bank's Savings Account: " + accountNum);

        BigDecimal availableBalance = balance.subtract(new BigDecimal(1000.00)); // minimum balance

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

}  // class SavingsAccount
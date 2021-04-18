package com.eviro.assessment.grad001.mxolisidladla;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        SystemDB savingsUser1 = new SystemDB(101, "1", new BigDecimal(2000.00));
        SystemDB savingsUser2 = new SystemDB(102, "2", new BigDecimal(5000.00));
        SystemDB currentUser1 = new SystemDB(103, "3", new BigDecimal(1000.00), new BigDecimal(10000.00));
        SystemDB currentUser2 = new SystemDB(104, "4", new BigDecimal(-5000.00), new BigDecimal(20000.00));


        try {
            accountChecker(savingsUser1.getAccountNum(), "1"); // check if the account exist in System

            SavingsAccount savingsAccount = new SavingsAccount(savingsUser1.getBalance()); // create an object for saving acc
            CurrentAccount currentAccount = new CurrentAccount(currentUser1.getBalance(), currentUser1.getOverdraft()); // create an object for current acc

            //savingsAccount.withdraw(savingsUser1.getAccountNum(), new BigDecimal(1500.00));
            currentAccount.withdraw(currentUser1.getAccountNum(), new BigDecimal(14000.00));

        } catch (AccountNotFoundException e) {
            System.err.print(e);
        }

    }  // method main


    static String accountChecker(String a, String b) throws AccountNotFoundException {
        if (a.equalsIgnoreCase(b))
            return a;
        else
            throw new AccountNotFoundException("Account does not exist!");
    } // method accountChecker

} // Main Class

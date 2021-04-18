package com.eviro.assessment.grad001.mxolisidladla;

import java.math.BigDecimal;

public class SystemDB {
    //private data member
    private int id;
    private String accountNum;
    private BigDecimal balance;
    private BigDecimal overdraft;

    //THIS Constructor IS FOR SavingsAccount.
    public SystemDB(int id, String accountNum, BigDecimal balance) {
        this.id = id;
        this.accountNum = accountNum;
        this.balance = balance;
    }

    //THIS Constructor IS FOR CurrentAccount.
    public SystemDB(int id, String accountNum, BigDecimal balance, BigDecimal overdraft) {
        this.id = id;
        this.accountNum = accountNum;
        this.balance = balance;
        this.overdraft = overdraft;

    }


    public int getId() {
        return id;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public BigDecimal getOverdraft() {
        return overdraft;
    }
} // SystemDB class
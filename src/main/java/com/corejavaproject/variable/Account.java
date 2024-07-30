package com.corejavaproject.variable;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Account {
    // static variable
    public static final String BANK_NAME = "SBI";

    // instance variable
    private final int accountNo = 1;
    private final String accountName ="Sunny";

    public static void main(String[] args) {
        // invoke the static variable
        log.info(Account.BANK_NAME);

        // create an object
        Account account = new Account();
        log.info(account.accountNo);
        log.info(account.accountName);

        // local variable
        float interestRate = 8.9f;
        log.info(interestRate);
    }
}


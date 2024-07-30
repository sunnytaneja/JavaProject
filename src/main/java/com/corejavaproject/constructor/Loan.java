package com.corejavaproject.constructor;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Loan {
    private final float interestRate;

    /**
     * Default constructor
     */
    public Loan(){
        log.info("#### Default Constructor  ###");
        this.interestRate = 8.0f;
    }

    /**
     * Parameterised constructor
     * @param rateOfInterest
     */
    public Loan(float rateOfInterest){
        log.info("#### Parameterised Constructor  ###");
        this.interestRate = rateOfInterest;
    }

    public static void main(String[] args) {
        Loan constructor = new Loan(10.0f);
        log.info(constructor.interestRate);
    }
}

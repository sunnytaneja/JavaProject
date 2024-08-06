package com.corejavaproject.jdbc.CustomExceptionClass;

public class BankDetailsNotFoundException extends Throwable {

    public BankDetailsNotFoundException(String errorMessage) {
        super(errorMessage);
    }
}

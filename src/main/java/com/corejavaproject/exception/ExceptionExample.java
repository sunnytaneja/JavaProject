package com.corejavaproject.exception;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class ExceptionExample {
    public static void main(String[] args) {
        ExceptionExample example = new ExceptionExample();
        int outputWithOutException = example.divideWithoutException(50, 10);
        log.info("OutputWithoutException:{}", outputWithOutException);
        int output = example.divide(10, 0);
        log.info("Output:{}", output);
        String userName = example.printLength("sunny");
        log.info("String Output is:{}", userName);
    }

    /**
     * Method with without Exception Code
     */
    public int divideWithoutException(int input1, int input2) {
        int responseWithoutException = input1 / input2;
        log.info("ResponseWithoutException:{}", responseWithoutException);
        return responseWithoutException;
    }

    /**
     * Method with Exception Code
     */
    public int divide(int input1, int input2) {
        int response = 0;
        try {
            response = input1 / input2;
        } catch (ArithmeticException ex) {
            log.error("Exception while divide the number", ex);
        }
        log.info("Response:{}", response);
        return response;
    }

    /**
     * Method with Exception Code
     */
    public String printLength(String name) {
        String mName = "";
        try {
            mName = String.valueOf(name.charAt(6));
        } catch (IndexOutOfBoundsException ex) {
            log.error("Index Out of BoundsException", ex);
        }
        log.info("String Response is:{}", mName);
        return mName;
    }
}

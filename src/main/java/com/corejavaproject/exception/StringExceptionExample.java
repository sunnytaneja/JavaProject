package com.corejavaproject.exception;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class StringExceptionExample {
    public static void main(String[] args) {
        StringExceptionExample stringExceptionExample = new StringExceptionExample();
        String userName = stringExceptionExample.retrieveChar("sunny");
        log.info("String Output is:{}", userName);
    }

    public String retrieveChar(String name) {
        String mName = "";
        
        try {
            mName = String.valueOf(name.charAt(6));
        } catch (StringIndexOutOfBoundsException ex) {
            log.error("String Index Out of BoundsException", ex);
        }
        log.info("String Response is:{}", mName);
        return mName;
    }
}

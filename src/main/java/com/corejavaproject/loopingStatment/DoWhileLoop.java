package com.corejavaproject.loopingStatment;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class DoWhileLoop {

    public static void main(String[] args) {
        int i = 1;
        do {
            log.info(i);
            i++;
        } while (i <= 5);
    }
}

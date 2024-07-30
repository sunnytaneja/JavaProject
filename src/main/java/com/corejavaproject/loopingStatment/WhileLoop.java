package com.corejavaproject.loopingStatment;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class WhileLoop {

    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            log.info(i);
            i++;
        }
    }
}

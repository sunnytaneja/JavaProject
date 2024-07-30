package com.corejavaproject.loopingStatment;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class ForLoop {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            log.info(i);
        }
    }
}

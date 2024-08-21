package com.corejavaproject.multithreadingExample.ThreadExampleWithClass;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class TicketBooking extends Thread {

    public void run() {
        log.info("{} start", Thread.currentThread().getName());

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        log.info("{} End", Thread.currentThread().getName());
    }
}

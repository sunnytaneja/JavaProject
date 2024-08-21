package com.corejavaproject.multithreadingExample.ThreadExampleWithRunnable;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class TicketBookingExample implements Runnable {
    public final int movideId;
    public String movieDescription;

    public TicketBookingExample(int mName, String desc) {
        this.movideId = mName;
        this.movieDescription = desc;
    }

    @Override
    public void run() {
        log.info("{} start", Thread.currentThread().getName());

        try {
            log.info("Movie Id is:{}", movideId);
            log.info("Movie Description is:{}", movieDescription);
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        log.info("{} End", Thread.currentThread().getName());
    }
}

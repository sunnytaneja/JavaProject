package com.corejavaproject.multithreadingExample.ThreadExampleWithLambda;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class TicketBooking extends Thread{

    public final int movideId;
    public String movieDescription;

    public TicketBooking(int mName, String desc) {
        this.movideId = mName;
        this.movieDescription = desc;
    }

    public void run() {
        log.info("{} start with lambda", Thread.currentThread().getName());

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        log.info("{} End with lambda", Thread.currentThread().getName());
    }
}

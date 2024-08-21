package com.corejavaproject.multithreadingExample.ThreadExampleWithRunnable;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class TicketBookingMain {
    public static void main(String[] args) {

        log.info("{} Start", Thread.currentThread().getName());

        TicketBookingExample ticketBookingExample1 = new TicketBookingExample(1, "good");
        TicketBookingExample ticketBookingExample2 = new TicketBookingExample(2, "good");
        TicketBookingExample ticketBookingExample3 = new TicketBookingExample(3, "Good");
        TicketBookingExample ticketBookingExample4 = new TicketBookingExample(4, "Good");

        Thread thread1 = new Thread(ticketBookingExample1);
        Thread thread2 = new Thread(ticketBookingExample2);
        Thread thread3 = new Thread(ticketBookingExample3);

        thread1.start();
        thread2.start();
        thread3.start();

        log.info("{} End", Thread.currentThread().getName());
    }
}

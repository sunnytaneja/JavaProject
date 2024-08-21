package com.corejavaproject.multithreadingExample.ThreadExampleWithLambda;
import com.corejavaproject.multithreadingExample.ThreadExampleWithRunnable.TicketBookingExample;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class TicketBookingMainWithLambda {

    public static void main(String[] args) {
        Runnable runnable = () -> {
            log.info("{} start with lambda", Thread.currentThread().getName());

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            log.info("{} End with lambda", Thread.currentThread().getName());
        };

        log.info("{} Start", Thread.currentThread().getName());

        TicketBooking ticketBooking1 = new TicketBooking(1, "good");
        TicketBooking ticketBooking2 = new TicketBooking(2, "good");
        TicketBooking ticketBooking3 = new TicketBooking(3, "Good");
        TicketBooking ticketBooking4 = new TicketBooking(4, "Good");

        Thread thread1 = new Thread(ticketBooking1);
        Thread thread2 = new Thread(ticketBooking2);
        Thread thread3 = new Thread(ticketBooking3);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

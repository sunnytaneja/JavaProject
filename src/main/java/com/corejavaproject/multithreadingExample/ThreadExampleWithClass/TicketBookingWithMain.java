package com.corejavaproject.multithreadingExample.ThreadExampleWithClass;

public class TicketBookingWithMain {

    public static void main(String[] args) {
        TicketBooking ticketBooking1 = new TicketBooking();
        ticketBooking1.start();

        TicketBooking ticketBooking2 = new TicketBooking();
        ticketBooking2.start();

        TicketBooking ticketBooking3 = new TicketBooking();
        ticketBooking3.start();
    }
}

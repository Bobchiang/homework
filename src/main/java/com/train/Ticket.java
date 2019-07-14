package com.train;

public class Ticket {
    int totalTicket;
    int roundTrip;

    public Ticket(int totalTicket, int roundTrip) {
        this.totalTicket = totalTicket;
        this.roundTrip = roundTrip;
    }

    public void print() {
        double total = (totalTicket - roundTrip) * 1000 + roundTrip * 2000 * 0.9;
        System.out.println("Total ticket: " + totalTicket + "\r\n" +
                "Round-trip: " + roundTrip + "\r\n" +
                "Total: " + (int)total);
    }
}

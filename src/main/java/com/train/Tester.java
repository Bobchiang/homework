package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalTicket = 0;
        do {
            System.out.print("Please enter number of tickets: ");
            totalTicket = scanner.nextInt();
            if (totalTicket == -1) {
                System.out.println("感謝您這次的訂票。");
                break;
            }
            System.out.print("How many round-trip tickets: ");
            int roundTrip = scanner.nextInt();
            Ticket ticket = new Ticket(totalTicket, roundTrip);
            ticket.print();

        } while (totalTicket != -1);
    }
}

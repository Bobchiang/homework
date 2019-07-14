package com.train

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    print("Please enter number of tickets: ")
    var totalTicket = scanner.nextInt()
    print("How many round-trip tickets: ")
    var roundTrip = scanner.nextInt()
    val ticket = KotlinTicket(totalTicket, roundTrip)
    ticket.print()
}

class KotlinTicket(var totalTicket: Int, var roundTrip: Int) {
    fun print() {
        val total = (totalTicket - roundTrip) * 1000 + roundTrip.toFloat() * 2000 * 0.9
        println(
            "Total ticket: " + totalTicket + "\r\n" +
                    "Round-trip: " + roundTrip + "\r\n" +
                    "Total: " + total.toInt()
        )
    }
}
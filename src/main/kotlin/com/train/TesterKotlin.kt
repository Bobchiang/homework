package com.train

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var totalTicket = 0
    do {
        print("Please enter number of tickets: ")
        totalTicket = scanner.nextInt()
        if (totalTicket == -1){
            println("感謝您這次的訂票。")
            break
        }
        print("How many round-trip tickets: ")
        var roundTrip = scanner.nextInt()
        val ticket = KotlinTicket(totalTicket, roundTrip)
        ticket.print()
    }while (totalTicket != -1)

}

class KotlinTicket(var totalTicket: Int, var roundTrip: Int) {
    fun print() {
        val total = (totalTicket - roundTrip) * 1000 + roundTrip.toFloat() * 2000 * 0.9

        if (totalTicket >= roundTrip) {
            println(
                "Total ticket: $totalTicket\r\n" +
                        "Round-trip: $roundTrip\r\n" +
                        "Total: ${total.toInt()}"
            )
        } else {
            println("總訂購張數不得低於來回票張數。")
        }
    }
}
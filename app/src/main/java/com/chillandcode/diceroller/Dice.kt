package com.chillandcode.diceroller

class Dice(private val numSides: Int) {
    private var sides = numSides
    fun roll(): Int {
        val diceRange: IntRange = 1..sides
        val randomNumber = diceRange.random()
        // val randomNumber=(1..sides).random()
        //println("dice roll result : $randomNumber")
        return randomNumber
    }

    fun printResult() {
        println("Rolled dice with $numSides and resulted in ${roll()}")
    }
}
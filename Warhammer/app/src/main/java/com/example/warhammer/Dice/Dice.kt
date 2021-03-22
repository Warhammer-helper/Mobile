package com.example.warhammer.Dice

class Dice {
    var diceSides: Int

    constructor(diceSides: Int)
    {
        this.diceSides = diceSides
    }
    fun diceRoll(Dice: Dice): Int {
        return (0..Dice.diceSides).random()
    }
}
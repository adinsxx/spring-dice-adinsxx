package edu.wctc.dice.iface;

//DieRoller interface
//Interface defines a method to generate a random number


import java.util.Random;

public interface DiceRoller {
    default int diceRolled(int roll){
        Random random = new Random();
        roll = random.nextInt(6) + 1;
        return roll;
    };
}

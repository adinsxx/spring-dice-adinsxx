package edu.wctc.dice.impl;

import edu.wctc.dice.iface.DiceRoller;

import java.util.Random;

public class rollIcosahedron implements DiceRoller {

    @Override
    public int diceRolled(int roll) {
        Random random = new Random();
        roll = random.nextInt(20) + 1;
        return roll;
    }
}

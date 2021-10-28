package org.example.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {
    @BeforeEach
    void setUp() {

        Dice dice = Dice.D6;
        System.out.println(dice.roll());

    }


    @Test
    void roll() {
        assertNotEquals(1, 1-6);

    }


}
package org.example.model;

import java.util.concurrent.ThreadLocalRandom;

public enum Dice {
    D6(6),
    D10(10),
    D20(20),
    D100(100);


    private int maxValue;

    Dice(int maxValue) {
        this.maxValue = maxValue;
    }


    public int roll(int num1 ){
        num1 = ThreadLocalRandom.current().nextInt(1, maxValue);
        return num1;

    }

    public int getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }
}

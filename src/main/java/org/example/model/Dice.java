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


    public int roll (){
        maxValue = ThreadLocalRandom.current().nextInt(1, maxValue + 1);
        return maxValue;

    }

    public int getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }
}

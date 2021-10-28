package org.example;


import org.example.model.Dice;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Dice dice = Dice.D6;
        Dice dice1 = Dice.D10;
        Dice dice2 = Dice.D20;
        Dice dice3 = Dice.D100;


        System.out.println(dice.roll(1));
        System.out.println(dice1.roll(1));
        System.out.println(dice2.roll(1));
        System.out.println(dice3.roll(1));






        }

}

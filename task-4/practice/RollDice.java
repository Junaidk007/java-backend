package practice;

import java.util.Random;

public class RollDice {

    public static void main(String[] args) {

        int dice1 = (int) (Math.random() * 6) + 1;
        int dice2 = (int) (Math.random() * 6) + 1;
        int total = dice1 + dice2;
        
        String rollType = (dice1 == dice2) ? "Doubles!" : "Regular";

        System.out.println("\n------ Roll Results ------");
        System.out.println("First Die  : " + dice1);
        System.out.println("Second Die : " + dice2);
        System.out.println("Total Roll : " + total);
        System.out.println("Result     : " + rollType + "\n");

    }
}
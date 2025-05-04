package org.designPatternProblems.snakeAndLadder;

import lombok.Data;

import java.util.concurrent.ThreadLocalRandom;

@Data
public class Dice {
    int diceCount;

    public Dice(int diceCount) {
        this.diceCount = diceCount;
    }
    public int rollDice() {
        int sum=0;
        for(int i=0;i<diceCount;i++){
            sum+= ThreadLocalRandom.current().nextInt(1,7);
        }
        return sum;
    }
}

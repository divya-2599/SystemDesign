package org.designPatternProblems.snakeAndLadder;

public class Game {
    public static void main(String[] args) {
        SnakeAndLadderGame snakeAndLadderGame = new SnakeAndLadderGame();
        System.out.println("Winner is : " + snakeAndLadderGame.startGame());
    }
}

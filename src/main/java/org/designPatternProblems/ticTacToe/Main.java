package org.designPatternProblems.ticTacToe;

public class Main {
    public static void main(String[] args) {
        TicTacToeGame game = new TicTacToeGame();
        System.out.println("Winner is : " + game.startGame());
    }
}

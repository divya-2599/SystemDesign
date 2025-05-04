package org.designPatternProblems.snakeAndLadder;

import java.util.Deque;
import java.util.LinkedList;

public class SnakeAndLadderGame {

    Board board;
    Deque<Player> players;
    Dice dice;
    Player winner;

    public SnakeAndLadderGame() {
        board = new Board(10,5, 6);
        dice = new Dice(1);
        winner = null;
        addPlayers();
    }

    public String startGame() {
        while(winner == null) {
            Player currPlayer = players.removeFirst();
            System.out.println("Player turn is : " + currPlayer.getId() + "curr position is : " + currPlayer.getCurrPosition());
            players.addLast(currPlayer);
            int position = currPlayer.getCurrPosition()+dice.rollDice();
            position = jumpCheck(position);
            currPlayer.setCurrPosition(position);
            System.out.println("Player turn is : " + currPlayer.getId() + "curr position is : " + currPlayer.getCurrPosition());
            if(currPlayer.getCurrPosition()>=board.cells.length*board.cells.length-1) {
                return currPlayer.getId();
            }
        }
        return null;
    }

    public void addPlayers() {
        players = new LinkedList<>();
        Player player1 = new Player("divya", 0);
        Player player2 = new Player("abc", 0);
        players.add(player1);
        players.add(player2);
    }

    public int jumpCheck(int position) {
        Cells cell = board.getCells(position);
        if(cell != null && cell.getJump() != null && position == cell.getJump().getStart()) {
            return cell.getJump().getEnd();
        }
        return position;
    }
}

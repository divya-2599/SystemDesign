package org.designPatternProblems.ticTacToe;

import org.apache.commons.lang3.tuple.Pair;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame {
    Deque<Player> players;
    Board board;

    public TicTacToeGame() {
        initializeGame();
    }

    private void initializeGame() {
        players = new LinkedList<>();
        Player player1 = new Player("Divya", new PlayingPiece(PieceType.O));
        Player player2 = new Player("ABC", new PlayingPiece(PieceType.X));
        players.add(player1);
        players.add(player2);
        board = new Board(3);
    }

    public String startGame() {
        boolean noWinner = true;
        while (noWinner) {
            Player player = players.removeFirst();
            board.printBoard();
            List<Pair<Integer, Integer>> freeCellsList = board.getFreeCells();
            if(freeCellsList.isEmpty()) {
                noWinner = false;
                continue;
            }
            System.out.println("Player " + player.getName() + ",please enter row, column : ");
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            String[] values = s.split(",");
            int row = Integer.parseInt(values[0]);
            int column = Integer.parseInt(values[1]);
            PlayingPiece playingPiece = player.getPlayingPiece();
            boolean pieceAddedSuccessfully = board.addPiece(row, column, playingPiece);
            if(!pieceAddedSuccessfully) {
                System.out.println("Incorrect position choosen, please try again");
                players.addFirst(player);
                continue;
            }
            players.addLast(player);
            boolean isWinner = isThereWinner(row, column, playingPiece.pieceType);
            if(isWinner) {
                return player.getName();
            }
        }
        return "tie";
    }

    public boolean isThereWinner(int row, int column, PieceType pieceType) {
        boolean rowMatch = true, colMatch = true, diagonalMatch = true, antiDiagonalMatch = true;

        for (int i = 0; i < board.size; i++) {
            // Check row and column
            if (board.playingPieces[row][i] == null || board.playingPieces[row][i].pieceType != pieceType) {
                rowMatch = false;
            }
            if (board.playingPieces[i][column] == null || board.playingPieces[i][column].pieceType != pieceType) {
                colMatch = false;
            }
            // Check diagonal
            if (board.playingPieces[i][i] == null || board.playingPieces[i][i].pieceType != pieceType) {
                diagonalMatch = false;
            }
            // Check anti-diagonal
            if (board.playingPieces[i][board.size - i - 1] == null || board.playingPieces[i][board.size - i - 1].pieceType != pieceType) {
                antiDiagonalMatch = false;
            }
        }

        return rowMatch || colMatch || diagonalMatch || antiDiagonalMatch;
    }
}

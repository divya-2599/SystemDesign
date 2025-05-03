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
        boolean rowMatch = true;
        boolean colMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;
        // check for row
        for(int j=0;j<board.size; j++) {
            if(board.playingPieces[row][j] == null || board.playingPieces[row][j].pieceType!=pieceType) {
                rowMatch = false;
            }
        }
        for(int i=0;i< board.size;i++) {
            if(board.playingPieces[i][column] == null || board.playingPieces[i][column].pieceType!=pieceType) {
                colMatch = false;
            }
        }
        for(int i=0;i< board.size;i++) {
            if(board.playingPieces[i][i] == null || board.playingPieces[i][i].pieceType != pieceType) {
                diagonalMatch = false;
            }
        }
        for(int i=0;i< board.size;i++) {
            if(board.playingPieces[i][board.size-i-1] == null || board.playingPieces[i][board.size-i-1].pieceType != pieceType) {
                antiDiagonalMatch = false;
            }
        }
        return rowMatch || colMatch || diagonalMatch || antiDiagonalMatch;
    }
}

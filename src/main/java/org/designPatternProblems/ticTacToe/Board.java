package org.designPatternProblems.ticTacToe;

import org.apache.commons.lang3.tuple.Pair;

import java.util.ArrayList;
import java.util.List;

public class Board {
    int size;
    public PlayingPiece[][] playingPieces;
    public Board(int size) {
        this.size=size;
        playingPieces = new PlayingPiece[size][size];
    }

    public boolean addPiece(int x, int y, PlayingPiece playingPiece) {
        if(playingPieces[x][y] != null) {
            return false;
        }
        playingPieces[x][y] = playingPiece;
        return true;
    }

    public List<Pair<Integer, Integer>> getFreeCells() {
        List<Pair<Integer, Integer>> list = new ArrayList<>();
        for(int i=0;i<playingPieces.length;i++) {
            for(int j=0;j<playingPieces[0].length;j++) {
                if(playingPieces[i][j] == null) {
                    Pair<Integer, Integer> pair = Pair.of(i, j);
                    list.add(pair);
                }
            }
        }
        return list;
    }

    public void printBoard() {
        for(int i=0;i<size;i++) {
            for(int j=0;j<size;j++) {
                if(playingPieces[i][j]!=null)
                    System.out.print(playingPieces[i][j].pieceType.name() + "|");
                else
                    System.out.print(" |");
            }
            System.out.println();
        }
    }
}

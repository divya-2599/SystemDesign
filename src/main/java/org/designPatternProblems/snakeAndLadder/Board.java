package org.designPatternProblems.snakeAndLadder;

import lombok.Data;

import java.util.Deque;
import java.util.LinkedList;
import java.util.concurrent.ThreadLocalRandom;

@Data
public class Board {
    public Cells[][] cells;

    public Board(int size, int snakeCount, int ladderCount) {
        initializeCells(size);
        addSnakesAndLadder(snakeCount, ladderCount);
    }

    public void initializeCells(int size) {
        cells = new Cells[size][size];
        for(int i=0;i<size;i++) {
            for(int j=0;j<size;j++) {
                cells[i][j] = new Cells();
            }
        }
    }

    public void addSnakesAndLadder(int snakeCount, int ladderCount) {
        while(snakeCount>0) {
            int snakeHead = ThreadLocalRandom.current().nextInt(0, (cells.length* cells.length -1));
            int snakeTail = ThreadLocalRandom.current().nextInt(0, (cells.length* cells.length -1));
            if(snakeHead<=snakeTail){
                continue;
            }
            Jump snakeObj = new Jump();
            snakeObj.setStart(snakeHead);
            snakeObj.setEnd(snakeTail);
            Cells cell = getCells(snakeHead);
            cell.setJump(snakeObj);
            snakeCount--;
        }
        while (ladderCount>0) {
            int ladderStart = ThreadLocalRandom.current().nextInt(1, (cells.length* cells.length -1));
            int ladderEnd = ThreadLocalRandom.current().nextInt(1, (cells.length* cells.length -1));
            if(ladderStart>=ladderEnd) {
                continue;
            }
            Jump ladderObject = new Jump();
            ladderObject.setStart(ladderStart);
            ladderObject.setEnd(ladderEnd);
            Cells cell = getCells(ladderStart);
            cell.setJump(ladderObject);
            ladderCount--;
        }
    }

    public Cells getCells(int playerPosition) {
        //System.out.println("Player position is : " + playerPosition);
        if(playerPosition>= 0 && playerPosition< cells.length* cells.length) {
            int row = playerPosition/cells.length;
            int column = playerPosition%cells.length;
            return cells[row][column];
        }
        return null;
    }
}

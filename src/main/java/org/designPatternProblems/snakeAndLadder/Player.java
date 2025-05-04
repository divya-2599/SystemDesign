package org.designPatternProblems.snakeAndLadder;

import lombok.Data;

@Data
public class Player {
    String id;
    int currPosition;

    public Player(String id, int currPosition) {
        this.id = id;
        this.currPosition = currPosition;
    }
}

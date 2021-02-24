package com.rps.rockpaperscissors.model;

import com.rps.rockpaperscissors.shape.Paper;
import com.rps.rockpaperscissors.shape.Rock;
import com.rps.rockpaperscissors.shape.Scissors;
import com.rps.rockpaperscissors.shape.Shape;
import lombok.Getter;

@Getter
public class Movement {
    private final Shape paper;
    private final Shape rock;
    private final Shape scissors;

    public Movement() {
        this.paper = new Paper();
        this.rock = new Rock();
        this.scissors = new Scissors();
    }
}

package com.rps.rockpaperscissors.messages;

import com.rps.rockpaperscissors.shape.Shape;

public class Command {
    public void selectShape() {
        System.out.println("\nPlease select 1, 2 or 3");
    }

    public void showSelectedShape(Shape playerShape, Shape computerShape) {
        System.out.println("Player: " + playerShape.getName() + ", " + "\nComputer: " + computerShape.getName());
    }

    public void showRoundScore(int player, int computer) {
        System.out.println("Round score: player " + player + ", computer " + computer);
    }
}

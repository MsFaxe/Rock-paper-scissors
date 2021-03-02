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

    public void wrongChoice() {
        System.out.println("WRONG! 1, 2 or 3!");
    }

    public void deadHead() {
        System.out.println("DEAD-HEAD");
    }

    public void showMatchScore(int playerScore, int computerScore) {
        System.out.println("You end game with score: player - "
                + playerScore
                + ", computer - "
                + computerScore);
    }

    public void confirmChoice() {
        System.out.println("Are you sure you want end the current game?");
        System.out.println("Y - yes, N - no");
    }
}

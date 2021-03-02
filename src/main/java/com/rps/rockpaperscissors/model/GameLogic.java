package com.rps.rockpaperscissors.model;

import com.rps.rockpaperscissors.messages.Command;
import com.rps.rockpaperscissors.shape.Shape;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GameLogic {
    private final String ROCK = "ROCK";
    private final String PAPER = "PAPER";
    private final String SCISSORS = "SCISSORS";

    private final PlayerMovement player = new PlayerMovement();
    private final ComputerMovement computer = new ComputerMovement();
    private final Score score = new Score();
    private final Command command = new Command();

    public void game(int numberOfRound) {
        while(numberOfRound>0) {
            score.gameScore(oneRound());
            numberOfRound -= 1;
        }

        System.out.println("You end game with score: player - "
                + score.getPlayerScore()
                + ", computer - "
                + score.getComputerScore());
    }

    Shape plSh = new Shape();
    public int[] oneRound() {
        command.selectShape();

        validateHumanChoice();

        Shape comSh = computer.computerTurn();
        command.showSelectedShape(plSh, comSh);

        int[] oneRoundScore = score.roundScore(plSh, comSh, gameScheme(plSh.getName(), comSh.getName()));
        command.showRoundScore(oneRoundScore[0], oneRoundScore[1]);

        return oneRoundScore;
    }

    private void validateHumanChoice() {
        Scanner scanner = new Scanner(System.in);
        try {
            int i = scanner.nextInt();
            if (i > 0 && i < 4) {
                plSh = player.playerTurn(i);
            } else {
                System.out.println("Please choose 1, 2 or 3");
                validateHumanChoice();
            }
        } catch (Exception e) {
            System.out.println("Please choose 1, 2 or 3");
            validateHumanChoice();
        }
    }

    private int[] gameScheme(String playerShape, String computerShape) {
        List shapes = Arrays.asList(playerShape, computerShape);
        int rock = 0, paper = 0, scissors = 0, win = 1;

        if (playerShape.equals(computerShape)) {
            System.out.println("DEAD-HEAD");
        } else if(shapes.contains(ROCK) && shapes.contains(PAPER)) {
            paper = win;
        } else if (shapes.contains(ROCK) && shapes.contains(SCISSORS)) {
            rock = win;
        } else if (shapes.contains(PAPER) && shapes.contains(SCISSORS)) {
            scissors = win;
        }

        return new int[]{rock, paper, scissors};
    }
}

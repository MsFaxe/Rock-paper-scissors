package com.rps.rockpaperscissors.model;

import com.rps.rockpaperscissors.shape.Paper;
import com.rps.rockpaperscissors.shape.Rock;
import com.rps.rockpaperscissors.shape.Scissors;
import com.rps.rockpaperscissors.shape.Shape;

import java.util.Scanner;

public class PlayerMovement extends Movement {
    private Scanner scanner = new Scanner(System.in);

    public Shape PlayerTurn() {
        String s = scanner.next();
        Shape shape = new Shape();

        switch (s) {
            case "1":
                shape = getPaper();
                break;
            case "2":
                shape = getRock();
                break;
            case "3":
                shape = getScissors();
                break;
            default:
                PlayerTurn();
                break;
        }
        return shape;
    }
}

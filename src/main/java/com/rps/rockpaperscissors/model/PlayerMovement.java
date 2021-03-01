package com.rps.rockpaperscissors.model;

import com.rps.rockpaperscissors.shape.Shape;

import java.util.Scanner;

public class PlayerMovement extends Movement {
    private Scanner scanner = new Scanner(System.in);

    public Shape playerTurn() {
        String s = scanner.next();
        Shape shape = new Shape();

        switch (s) {
            case "1":
                shape = getRock();
                break;
            case "2":
                shape = getPaper();
                break;
            case "3":
                shape = getScissors();
                break;
            default:
                playerTurn();
                break;
        }
        return shape;
    }
}

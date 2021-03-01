package com.rps.rockpaperscissors.model;

import com.rps.rockpaperscissors.shape.Shape;

import java.util.Random;

public class ComputerMovement extends Movement{

    public Shape computerTurn() {
        Random random = new Random();
        int i = random.nextInt(3);
        Shape shape = new Shape();

        switch(i){
            case 0:
                shape = getRock();
                break;
            case 1:
                shape = getPaper();
                break;
            case 2:
                shape = getScissors();
                break;
        }
        return shape;
    }
}

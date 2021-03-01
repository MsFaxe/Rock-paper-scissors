package com.rps.rockpaperscissors.model;

import com.rps.rockpaperscissors.shape.Shape;

public class PlayerMovement extends Movement {
    public Shape playerTurn(int i) {
        Shape shape = new Shape();

        switch (i) {
            case 1:
                shape = getRock();
                break;
            case 2:
                shape = getPaper();
                break;
            case 3:
                shape = getScissors();
                break;
        }
        return shape;
    }
}

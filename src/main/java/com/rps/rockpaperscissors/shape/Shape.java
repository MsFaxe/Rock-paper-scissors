package com.rps.rockpaperscissors.shape;

public class Shape {
    private String name;

    public String win() {
        return getName() + " won";
    }

    public String defeat() {
        return getName() + " lost";
    }

    public String getName() {
        return name;
    }
}

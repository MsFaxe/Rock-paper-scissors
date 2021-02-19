package com.rps.rockpaperscissors.shape;

public class Shape {
    private String name;

    public void win() {
        System.out.println(getName() + " won");
    }

    public void defeat() {
        System.out.println(getName() + " lost");
    }

    public String getName() {
        return name;
    }
}

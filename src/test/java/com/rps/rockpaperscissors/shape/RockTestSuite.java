package com.rps.rockpaperscissors.shape;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RockTestSuite {
    @Test
    public void testGetNameMethod() {
        //Given
        Shape shape = new Rock();

        //When
        String shapeName = shape.getName();

        //Then
        assertEquals("ROCK", shapeName);
    }

    @Test
    public void testWinMethod() {
        //Given
        Shape shape = new ROCK();

        //When
        String shapeWin = shape.win();

        //Then
        assertEquals("ROCK won", shapeWin);
    }

    @Test void testLoseMetod() {
        //Given
        Shape shape = new ROCK();

        //When
        String shapeLose = shape.win();

        //Then
        assertEquals("ROCK lost", shapeLose);
    }
}

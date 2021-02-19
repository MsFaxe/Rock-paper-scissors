package com.rps.rockpaperscissors.shape;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ScissorsTestSuite {
    @Test
    public void testGetNameMethod() {
        //Given
        Shape shape = new Scissors();

        //When
        String shapeName = shape.getName();

        //Then
        assertEquals("SCISSORS", shapeName);
    }

    @Test
    public void testWinMethod() {
        //Given
        Shape shape = new Scissors();

        //When
        String shapeWin = shape.win();

        //Then
        assertEquals("SCISSORS won", shapeWin);
    }

    @Test void testLoseMetod() {
        //Given
        Shape shape = new Scissors();

        //When
        String shapeLose = shape.defeat();

        //Then
        assertEquals("SCISSORS lost", shapeLose);
    }
}

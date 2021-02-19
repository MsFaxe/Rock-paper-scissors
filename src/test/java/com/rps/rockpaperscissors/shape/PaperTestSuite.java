package com.rps.rockpaperscissors.shape;

import org.junit.Test;

import static org.junit.Assert.*;


public class PaperTestSuite {
    @Test
    public void testGetNameMethod() {
        //Given
        Shape shape = new Paper();

        //When
        String shapeName = shape.getName();

        //Then
        assertEquals("PAPER", shapeName);
    }

    @Test
    public void testWinMethod() {
        //Given
        Shape shape = new Paper();

        //When
        String shapeWin = shape.win();

        //Then
        assertEquals("PAPER won", shapeWin);
    }

    @Test void testLoseMetod() {
        //Given
        Shape shape = new Paper();

        //When
        String shapeLose = shape.lose();

        //Then
        assertEquals("PAPER lost", shapeLose);
    }

}
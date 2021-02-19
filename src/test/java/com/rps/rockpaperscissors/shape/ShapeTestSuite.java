package com.rps.rockpaperscissors.shape;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShapeTestSuite {
    @Test
    public void testGetNameMethod() {
        //Given
        Shape shape = new Shape();

        //When
        String shapeName = shape.getName();

        //Then
        assertEquals(null, shapeName);
    }

    @Test
    public void testWinMethod() {
        //Given
        Shape shape = new Shape();

        //When
        String shapeWin = shape.win();

        //Then
        assertEquals("null won", shapeWin);
    }

    @Test
    public void testDefeatMethod() {
        //Given
        Shape shape = new Shape();

        //When
        String shapeDefeat = shape.defeat();

        //Then
        assertEquals("null lost", shapeDefeat);
    }
}

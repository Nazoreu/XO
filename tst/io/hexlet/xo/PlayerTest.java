package io.hexlet.xo;

import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void testgetName() throws Exception {
        final String inputValue = "Slava";
        final String expectedVelue = inputValue;

        final Player player = new Player(inputValue, null);

        final String actualValue = player.getName();

        assertEquals(expectedVelue, actualValue);
    }

    @Test
    public void testgetFigure() throws Exception {
        final Figure inputValue = Figure.X;
        final Figure expectedVelue = inputValue;

        final Player player = new Player(null, inputValue);

        final Figure actualValue = player.getFigure();

        assertEquals(expectedVelue, actualValue);
    }
}
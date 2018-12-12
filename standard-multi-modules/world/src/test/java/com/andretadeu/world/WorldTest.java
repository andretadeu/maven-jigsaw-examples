package com.andretadeu.world;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple World.
 */
public class WorldTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldReturnWorld() {
        assertEquals("world", World.name());
    }
}

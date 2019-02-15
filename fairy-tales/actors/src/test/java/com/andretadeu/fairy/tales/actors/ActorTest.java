package com.andretadeu.fairy.tales.actors;

import com.andretadeu.fairy.tales.actors.impl.DefaultActor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ActorTest {
    private static final String NAME = "Sean Connery";
    private static final Actor SEAN = Imagination.createActor(NAME);

    @Test
    public void nameMatches() {
        assertEquals(NAME, SEAN.name());
    }

    @Test
    public void accurateToString() {
        assertEquals(NAME, SEAN.toString());
    }

    @Test
    public void canReachDefaultActor() {
        Actor actor = new DefaultActor("Kevin Costner");
        assertEquals("Kevin Costner", actor.toString());
    }
}

package com.andretadeu.fairy.tales.formula.events;

import com.andretadeu.fairy.tales.actors.Actor;

/**
 * Something that some {@link Actor} did.
 */
public class IntransativeEvent implements Event {
    private final Actor actor;
    private final String action;

    public IntransativeEvent(Actor actor, String action) {
        this.actor = actor;
        this.action = action;
    }

    @Override
    public String toString() {
        return actor + " " + action;
    }
}

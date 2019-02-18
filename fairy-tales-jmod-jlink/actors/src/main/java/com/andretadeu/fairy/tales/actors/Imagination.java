package com.andretadeu.fairy.tales.actors;

import com.andretadeu.fairy.tales.actors.impl.DefaultActor;
import com.andretadeu.fairy.tales.actors.impl.DefaultGroup;

import java.util.Set;

/**
 * The place where {@link Actor}s and {@link Group}s come from.
 */
public class Imagination {
    /**
     * Creates and returns an {@link Actor} with the given <code>name</code>.
     */
    public static Actor createActor(String name) {
        return new DefaultActor(name);
    }

    /**
     * Creates a {@link Group} with the given <code>name</code> containing the <code>actors</code>
     */
    public static Group createGroup(String name, Actor... actors) {
        return new DefaultGroup(name, Set.of(actors));
    }
}

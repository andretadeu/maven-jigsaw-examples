package com.andretadeu.fairy.tales.app;

import com.andretadeu.fairy.tales.tale.Tale;

import java.util.ServiceLoader;

class StoryTeller {

    public static void main(String[] args) {
        ServiceLoader<Tale> loader = ServiceLoader.load(Tale.class);
        if (!loader.iterator().hasNext()) {
            System.out.println("Alas, I have no tales to tell!");
        }
        for (Tale tale : loader) {
            tale.tell();
        }
    }
}

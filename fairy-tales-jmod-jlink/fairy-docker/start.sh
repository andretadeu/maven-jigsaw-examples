#!/bin/bash

java --module-path /app --module com.andretadeu.fairy.tales.app/com.andretadeu.fairy.tales.app.StoryTeller \
    -Dfile.encoding=UTF-8 -Duser.country=US -Duser.language=en -Duser.variant \
    -jar /app/com.andretadeu.fairy.tales.fairy-1.0-SNAPSHOT-client.jar
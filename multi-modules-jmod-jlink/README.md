# multi-modules-jmod-jlink

Maven multi-modules project that generate *jmod* files with *maven-jmod-plugin*.
This plugin does not compile in Java 11 projects at the moment.

## Important notes

Every time you want to publish a slim JVM generated through *jlink* using Maven, you are
forced to create another Maven module inside your project. I could have tried to do some
workaround with maven-jlink-plugin, but I would end up polluting the *greetings/pom.xml*
and losing some maintainability once I add other modules to the solution.


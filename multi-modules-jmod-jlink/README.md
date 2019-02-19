# multi-modules-jmod-jlink

Maven multi-modules project that generate *jmod* files with *maven-jmod-plugin*.
This plugin does not compile in Java 11 projects at the moment.

## Important notes

Every time you want to publish a slim JVM generated through *jlink* using Maven, you are
forced to create another Maven module inside your project. I could have tried to do some
workaround with maven-jlink-plugin, but I would end up polluting the *greetings/pom.xml*
and losing some maintainability once I add other modules to the solution.

## Prerequisites

To run this example, you must have installed:

- Java 11
- Maven 3.6.0
- Docker CE or EE

## How to build

Firstly, you must clone the *maven-jmod-plugin* and *maven-jlink-plugin* repository to build the plugins:

For Maven JMOD plugin:

```{bash}
git clone https://github.com/apache/maven-jmod-plugin.git
cd maven-jmod-plugin
```

For Maven JLINK plugin:

```{bash}
git clone https://github.com/apache/maven-jlink-plugin.git
cd maven-jmod-plugin
```

and then build each plugin:

```{bash}
mvn clean install
```

After that, change to this project's directory and run:

```{bash}
mvn clean package
```

## How to run

Since the build generates a Docker image, it is enough to execute:

```{bash}
docker run -it --name test-2 andretadeu/greetings-jlink-multi-module-slim:1.0-SNAPSHOT
```
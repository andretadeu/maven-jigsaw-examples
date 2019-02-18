# maven-jigsaw-examples

For now I have two examples of modularized Java applications

1. standard-multi-modules: generates a 986MB Docker image to run a simple application
2. multi-modules-jmod-jlink: generates a 65.2MB Docker image to run the same application
3. fairy-tales: testing how to build the example in https://github.com/gradle-guides/building-java-9-modules in Maven
4. fairy-tales-jmod-jlink: another version of fairy-tales without Guava and using JMOD and JLink

## Prerequisites

To run these examples, you must have installed:

- Java 11
- Maven 3.6.0
- Docker CE or EE

## How to build

Firstly, you must clone the *maven-jmod-plugin* and *maven-jlink-plugin* repository to build the plugins:

For Maven JMOD plugin:

```{bash}
git clone https://github.com/andretadeu/maven-jmod-plugin.git
cd maven-jmod-plugin
git checkout cleanup-classpath
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

Finally, you can select either of the projects to build.

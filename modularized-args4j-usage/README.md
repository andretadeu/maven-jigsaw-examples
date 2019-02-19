# modularized-args4j-usage

Example on how a modularized library that needs to use reflection in the application's
classes works with **jmod** and **jlink**.

## Prerequisites

To run this example, you must have installed:

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

Secondly, you must build **java-modularity-examples/args4j** project:

```{bash}
git clone https://github.com/java-modularity-examples/args4j.git
cd args4j
```

and the build and install it in your local Maven repository:

```{bash}
mvn clean install
```

Finally, change to this project's directory and run:

```{bash}
mvn clean package
```

## How to run

Since the build generates a Docker image, it is enough to execute:

```{bash}
docker run -it --name test andretadeu/app-jlink-slim:1.0-SNAPSHOT
```
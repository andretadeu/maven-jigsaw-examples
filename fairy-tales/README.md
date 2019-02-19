# fairy-tales

Evaluating what was done in https://github.com/gradle-guides/building-java-9-modules and porting it to Maven.

## Prerequisites

To run this example, you must have installed:

- Java 11
- Maven 3.6.0

## How to build

For this project, it is enough to run the Maven command below:

```{bash}
mvn clean package
```

## How to run

Since the build generates a Docker image, it is enough to execute:

```{bash}
docker run -it --name test-3 andretadeu/fairy-docker-multi-module:1.0-SNAPSHOT
```
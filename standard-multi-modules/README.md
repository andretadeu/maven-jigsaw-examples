# standard-multi-modules

Classic multi-module Maven project with Java 11 projects.

## Prerequisites

To run these examples, you must have installed:

- Java 11
- Maven 3.6.0
- Docker CE or EE

## How to build

Firstly, you must clone the *maven-jmod-plugin* repository, change to the cloned directory, and change to the branch *develop*:

```{bash}
git clone https://github.com//maven-jmod-plugin.git
cd maven-jmod-plugin
git checkout develop
```

and then build the plugin needed to run this example:

```{bash}
mvn clean install
```

After that, change to this project's directory and run:

```{bash}
mvn clean package
```
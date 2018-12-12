FROM openjdk:11

LABEL maintainer="Andre Tadeu de Carvalho <andre.tadeu.de.carvalho@gmail.com>"

WORKDIR /app

ADD target/com.andretadeu.world-1.0-SNAPSHOT.jar .
ADD target/com.andretadeu.greetings-1.0-SNAPSHOT.jar .

ENTRYPOINT ["java", "-jar", "/app/com.andretadeu.greetings-1.0-SNAPSHOT.jar"]

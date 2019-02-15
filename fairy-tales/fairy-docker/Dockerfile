FROM openjdk:11

LABEL maintainer="Andre Tadeu de Carvalho <andre.tadeu.de.carvalho@gmail.com>"

RUN mkdir -p /app

WORKDIR /app

ADD target/lib/ .

ENTRYPOINT ["java", "-jar", "/app/com.andretadeu.fairy.tales.fairy-1.0-SNAPSHOT.jar"]
FROM openjdk:11

LABEL maintainer="Andre Tadeu de Carvalho <andre.tadeu.de.carvalho@gmail.com>"

RUN mkdir /app

ADD target/lib/*.jar /app/
ADD start.sh /

RUN chmod +x start.sh

ENTRYPOINT [ "/start.sh" ]
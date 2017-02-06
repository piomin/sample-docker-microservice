FROM openjdk
MAINTAINER Piotr Minkowski <piotr.minkowski@play.pl>
ADD sample-docker-microservice-1.0-SNAPSHOT.jar person-service.jar
ENTRYPOINT ["java", "-jar", "/person-service.jar"]
EXPOSE 8761
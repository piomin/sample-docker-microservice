FROM alpine:latest AS build
ENV JAVA_HOME /opt/jdk/jdk-21.0.1
ENV PATH $JAVA_HOME/bin:$PATH

ADD https://download.bell-sw.com/java/21.0.1+12/bellsoft-jdk21.0.1+12-linux-x64-musl.tar.gz /opt/jdk/
RUN tar -xzvf /opt/jdk/bellsoft-jdk21.0.1+12-linux-x64-musl.tar.gz -C /opt/jdk/
RUN ["jlink", "--compress=2", \
     "--module-path", "/opt/jdk/jdk-21.0.1/jmods/", \
     "--add-modules", "java.base,java.desktop,java.management,java.naming,java.rmi,java.sql,jdk.compiler,jdk.unsupported", \
     "--no-header-files", "--no-man-pages", \
     "--output", "/quarkus-runtime"]

FROM alpine:latest
COPY --from=build  /quarkus-runtime /opt/jdk
ENV PATH=$PATH:/opt/jdk/bin
ENV JAVA_OPTIONS="-Dquarkus.http.host=0.0.0.0 -Djava.util.logging.manager=org.jboss.logmanager.LogManager"
COPY ../target/quarkus-microservice-1.0-SNAPSHOT-runner.jar /opt/app/
CMD ["java", "-showversion", "-jar", "/opt/app/quarkus-microservice-1.0-SNAPSHOT-runner.jar"]
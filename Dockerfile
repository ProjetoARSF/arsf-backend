FROM gradle:latest AS build
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle build

FROM openjdk:latest
EXPOSE 8080
RUN mkdir /app
COPY --from=build /home/gradle/src/build/libs/arsf.config-1.0.0.jar /app/arsf.jar
#FROM openjdk:latest
#VOLUME /tmp
#ARG JAVA_OPTS
#ENV JAVA_OPTS=$JAVA_OPTS
#COPY build/libs/arsf.config-1.0.0.jar arsf.jar
#EXPOSE 8080
#ENTRYPOINT exec java $JAVA_OPTS -jar arsf.jar
#ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar arsf.jar
ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app/arsf.jar
# For Spring-Boot project, use the entrypoint below to reduce Tomcat startup time.
 
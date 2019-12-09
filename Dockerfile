# back
FROM openjdk:8-jdk-alpine

LABEL maintainer="2262288@gmail.com"
VOLUME /tmp

EXPOSE 8081

ARG JAR_FILE=build/libs/docker-profiles-0.0.1.jar
ADD ${JAR_FILE} profiles.jar
ENTRYPOINT ["java","-jar","/profiles.jar", "-Denv=prod"]

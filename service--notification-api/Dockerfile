FROM maven:3.9.7-eclipse-temurin-21 AS build
RUN mkdir /src
COPY . /src
WORKDIR /src
RUN mvn clean install -DskipTests
FROM ghcr.io/graalvm/graalvm-community:21
COPY /target/*.jar /app/app.jar
WORKDIR /app

EXPOSE 8080 8080

ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -jar app.jar"]
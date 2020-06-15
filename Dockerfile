FROM openjdk:8-jdk-alpine

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} time-intake.jar
ENTRYPOINT ["java","-jar","/time-intake.jar"]
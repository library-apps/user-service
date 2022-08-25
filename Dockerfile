FROM openjdk:17-jdk-alpine
EXPOSE 8081
COPY target/user.jar user.jar
ENTRYPOINT ["java", "-jar","user.jar"]
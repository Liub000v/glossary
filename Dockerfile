FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
//docker build -t itmo/web-glossary .
//docker run -p 8080:8080 -t itmo/web-glossary
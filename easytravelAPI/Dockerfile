FROM openjdk:17
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/easytravelAPI-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} easytravelAPI.jar
ENTRYPOINT ["java","-jar","/easytravelAPI.jar"]
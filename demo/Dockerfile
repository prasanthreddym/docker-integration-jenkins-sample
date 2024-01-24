#intial docker file
FROM openjdk:17
EXPOSE 8080
ADD target/spring-docker-demo.jar spring-docker-demo.jar
ENTRYPOINT ["java" ,"-jar","/spring-docker-demo.jar"]
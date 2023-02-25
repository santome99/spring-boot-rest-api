FROM openjdk:11
ADD target/helloApi.jar helloApi.jar
ENTRYPOINT ["java", "-jar","helloApi.jar"]
EXPOSE 8080
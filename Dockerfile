# docker image
FROM openjdk:17
ADD target/test-cicd.jar test-cicd.jar
ENTRYPOINT ["java","-jar","test-cicd.jar"]

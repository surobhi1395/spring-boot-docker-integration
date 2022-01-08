FROM openjdk:8
LABEL maintainer="surobhi"
ADD target/spring-boot-docker-integration.jar spring-boot-docker-integration.jar

ENTRYPOINT ["java", "-jar", "spring-boot-docker-integration.jar"]

EXPOSE 8080
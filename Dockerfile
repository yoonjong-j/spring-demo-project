FROM openjdk:17
CMD mkdir /app/step1
WORKDIR /app/step1/
COPY ../build/libs/*.jar /app/step1/

ENTRYPOINT ["java", "-jar", "spring-demo-project-0.0.1-SNAPSHOT.jar"]

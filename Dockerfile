FROM eclipse-temurin:17-jdk
COPY target/AwsIntegration-BatchJob-0.0.1-SNAPSHOT app.jar
ENTRYPOINT ["java","-jar","/app.jar"]

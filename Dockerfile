FROM eclipse-temurin:17-jdk
COPY target/aws-integration-batch-job.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]

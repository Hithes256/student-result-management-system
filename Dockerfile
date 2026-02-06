FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY target/student-result-1.0.jar app.jar
EXPOSE 9090
CMD ["java", "-jar", "app.jar"]

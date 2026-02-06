FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY target/student-result-management-system-1.0-SNAPSHOT.jar app.jar
EXPOSE 9090
CMD ["java", "-jar", "app.jar"]

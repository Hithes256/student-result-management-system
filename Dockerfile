FROM openjdk:17
WORKDIR /app
COPY target/student-result-1.0.jar app.jar
EXPOSE 9090
CMD ["java", "-jar", "app.jar", "--server.port=9090"]

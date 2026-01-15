# 1️⃣ Base image with Java 21
FROM eclipse-temurin:21-jdk
# 2️⃣ Set working directory inside container
WORKDIR /app

# 3️⃣ Copy JAR from host to container
COPY target/docker-demo.jar app.jar

# 4️⃣ Expose Spring Boot port
EXPOSE 8080
# 5️⃣ Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
FROM maven:3.8.3-openjdk-17
WORKDIR /app2
COPY /app .
RUN mvn clean package -DskipTests
RUN ls -l
EXPOSE 8080
CMD ["java", "-jar", "/app2/target/inventorycontrol-0.0.1-SNAPSHOT.jar"]

FROM openjdk:17-jdk-alpine

WORKDIR /dockerr
COPY docker/inventorycontrol.jar /dockerr/inventorycontrol.jar
CMD ["java", "-jar", "inventorycontrol.jar"]
EXPOSE 8080
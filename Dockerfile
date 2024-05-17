FROM maven:3.8.3-openjdk-17-slim AS build

# Crie um diretório app2
WORKDIR /app2

# Copie os arquivos do diretório raiz /app para dentro de app2
COPY /app .

# Verifique os arquivos copiados
RUN ls -l

# Execute os comandos Maven sem mudar de diretório
RUN mvn clean package -DskipTests


FROM amazoncorretto:17-alpine3.19
COPY --from=build /app/target/inventorycontrol-0.0.1-SNAPSHOT.jar /inventorycontrol-0.0.1-SNAPSHOT.jar
EXPOSE 8080
CMD ["java", "-jar", "/inventorycontrol-0.0.1-SNAPSHOT.jar"]

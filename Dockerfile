FROM maven:3.8.3-openjdk-17-slim AS build

# Cria um diretório app2
WORKDIR /app2

# Copia os arquivos do diretório raiz /app para dentro de app2
COPY /app .

# Verifica os arquivos copiados
RUN ls -l

# Executa os comandos Maven sem mudar de diretório
RUN mvn clean package -DskipTests

FROM amazoncorretto:17-alpine3.19

# Cria um diretório app2
WORKDIR /app2

# Copia o arquivo JAR gerado durante o estágio de build para dentro de app2
COPY --from=build /app/target/inventorycontrol-0.0.1-SNAPSHOT.jar .

# Expõe a porta 8080
EXPOSE 8080

# Define o comando padrão para iniciar o aplicativo Java a partir do arquivo JAR
CMD ["java", "-jar", "inventorycontrol-0.0.1-SNAPSHOT.jar"]

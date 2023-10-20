FROM maven:3.8.5-openjdk-17 AS buil 
WORKDIR /app
COPY . /app/

FROM openjdk:17-alpine
WORKDIR /app
COPY --from=buil /app/target/*.jar /app/app.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","app.jar"]

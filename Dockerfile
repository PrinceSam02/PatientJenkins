FROM openjdk:18
WORKDIR /app
COPY ./target/Patient-0.0.1-SNAPSHOT.jar /app
EXPOSE 8080
CMD ["java", "-jar", "Patient-0.0.1-SNAPSHOT.jar"]

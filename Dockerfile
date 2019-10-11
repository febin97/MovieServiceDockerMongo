FROM openjdk:11
WORKDIR usr/src
COPY ./target/movie-service-0.0.1-SNAPSHOT.jar /usr/src/movie-service-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/usr/src/movie-service-0.0.1-SNAPSHOT.jar"]

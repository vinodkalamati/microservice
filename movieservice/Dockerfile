FROM openjdk:11
ADD ./target/movie-mongo.jar /usr/src/movie-mongo.jar
WORKDIR usr/src
ENTRYPOINT ["java","-jar", "movie-mongo.jar"]
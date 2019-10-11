FROM openjdk:11
ADD ./target/spring-config-server-demo-0.0.1-SNAPSHOT.jar /usr/src/spring-config-server-demo-0.0.1-SNAPSHOT.jar
WORKDIR usr/src
ENTRYPOINT ["java","-jar", "spring-config-server-demo-0.0.1-SNAPSHOT.jar"]
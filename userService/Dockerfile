FROM openjdk:11
ADD ./target/userService.jar /usr/src/userService.jar
WORKDIR usr/src
ENTRYPOINT ["java","-jar", "userService.jar"]
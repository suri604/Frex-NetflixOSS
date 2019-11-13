FROM openjdk:11
ADD ./target/SpringEureka-0.0.1-SNAPSHOT.jar /usr/src/SpringEureka-0.0.1-SNAPSHOT.jar
EXPOSE 8761
WORKDIR usr/src
ENTRYPOINT ["java","-jar","SpringEureka-0.0.1-SNAPSHOT.jar"]
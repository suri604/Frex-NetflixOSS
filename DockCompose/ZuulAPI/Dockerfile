FROM openjdk:11
WORKDIR usr/src
ADD ./target/ZuulAPI-0.0.1-SNAPSHOT.jar /usr/src/ZuulAPI-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/usr/src/ZuulAPI-0.0.1-SNAPSHOT.jar"]
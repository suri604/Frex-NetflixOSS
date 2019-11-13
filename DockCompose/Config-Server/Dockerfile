FROM openjdk:11
ADD target/SpringCOnfigServer-0.0.1-SNAPSHOT.jar /usr/src/SpringCOnfigServer-0.0.1-SNAPSHOT.jar
EXPOSE 8888
WORKDIR usr/src
ENTRYPOINT ["java","-jar","SpringCOnfigServer-0.0.1-SNAPSHOT.jar"]
FROM java:openjdk-8-jre
CMD java -jar discovery-service-1.0-SNAPSHOT.jar
EXPOSE 8761
COPY target/discovery-service-1.0-SNAPSHOT.jar .
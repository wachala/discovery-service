FROM maven:3-jdk-8-slim
CMD java -jar /webapp/discovery-service/target/discovery-service-1.0-SNAPSHOT.jar
EXPOSE 8761
COPY ./ /webapp/discovery-service
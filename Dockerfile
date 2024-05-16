
# build stage

#From maven:3.9.6-jdk-17 as build
From maven:3.8.1-jdk-11 as build
WORKDIR /home/app/src
COPY  ./pom.xml  /home/app
RUN mvn -f /home/app/pom.xml  clean package



From openjdk

EXPOSE 8087

ADD target/spring-docker-ec2-0.0.1.jar spring-docker-ec2-0.0.1.jar

ENTRYPOINT ["java","-jar","spring-docker-ec2-0.0.1.jar"]

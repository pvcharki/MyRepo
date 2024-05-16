From openjdk

EXPOSE 8087

ADD target/spring-docker-ec2-0.0.1.jar spring-docker-ec2-0.0.1.jar

ENTRYPOINT ["java","-jar","spring-docker-ec2-0.0.1.jar"]
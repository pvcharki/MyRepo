FROM openjdk

EXPOSE 8087

ADD target/CloudWatchExample-0.0.1.jar CloudWatchExample-0.0.1.jar

ENTRYPOINT ["java","-jar","CloudWatchExample-0.0.1.jar"]
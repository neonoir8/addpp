FROM openjdk:17
EXPOSE 8081
ENV TZ Europe/Moscow
COPY target/addpp-0.0.1-SNAPSHOT.jar addpp-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/addpp-0.0.1-SNAPSHOT.jar"]
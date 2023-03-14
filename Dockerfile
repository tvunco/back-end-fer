FROM amazoncorretto:8
MAINTAINER FER
COPY target/fer-0.0.1-SNAPSHOT.jar fer-app.jar 
ENTRYPOINT ["java","-jar","/fer-app.jar"]   
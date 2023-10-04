FROM eclipse-temurin:17-jdk
WORKDIR /docker
COPY ./build/libs/TurnIn3-DevOps-1.0-SNAPSHOT.jar TurnIn3-DevOps.jar
ENTRYPOINT ["java", "-jar" , "TurnIn3-DevOps.jar"]

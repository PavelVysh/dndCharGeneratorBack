FROM amazoncorretto:17
COPY target/dndCharCreator-0.0.1-SNAPSHOT.jar /dnd.jar
CMD ["java", "-jar", "dnd.jar"]
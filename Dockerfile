FROM java:8
COPY build/libs/1-1.0.jar /
ENTRYPOINT ["java", "-jar", "1-1.0.jar"]
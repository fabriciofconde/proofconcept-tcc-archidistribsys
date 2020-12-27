FROM openjdk:13-alpine

RUN addgroup -S tcc && adduser -S tcc -G tcc
USER tcc:tcc

VOLUME /tmp

EXPOSE 8081

COPY target/dev-api*.jar app.jar

ENTRYPOINT ["java", "-Dspring.profiles.active=qa", "-jar", "/app.jar"]
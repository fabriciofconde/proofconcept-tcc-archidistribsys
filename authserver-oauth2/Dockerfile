FROM openjdk:13-alpine

RUN addgroup -S tcc && adduser -S tcc -G tcc
USER tcc:tcc

VOLUME /tmp

EXPOSE 8082

COPY target/authserver-oauth2*.jar app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]
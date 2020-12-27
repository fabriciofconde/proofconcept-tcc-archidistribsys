FROM openjdk:13-alpine

RUN addgroup -S tcc && adduser -S tcc -G tcc
USER tcc:tcc

VOLUME /tmp

EXPOSE 8080

COPY target/api-gateway-zuul*.jar app.jar

ENTRYPOINT ["java", "-Dspring.profiles.active=qa", "-jar","/app.jar"]
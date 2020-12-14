FROM maven:3-jdk-11 as builder

ADD . /build
WORKDIR /build

RUN mvn clean package

FROM adoptopenjdk:11-jre-hotspot

COPY --from=builder /build/target/*.jar ./app.jar

EXPOSE 8002

CMD ["java", "-jar", "app.jar"]
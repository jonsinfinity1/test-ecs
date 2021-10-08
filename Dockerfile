FROM openjdk:17-jdk-alpine
COPY ./build/libs/test-ecs-0.0.1-SNAPSHOT.jar test-ecs-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar","test-ecs-0.0.1-SNAPSHOT.jar"]

EXPOSE 80

HEALTHCHECK --start-period=30s --interval=30s --timeout=3s --retries=3 \
            CMD curl --silent --fail --request GET http://localhost:80/actuator/health \
                | jq --exit-status '.status == "UP"' || exit 1
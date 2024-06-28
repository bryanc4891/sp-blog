FROM eclipse-temurin:17

WORKDIR /app

COPY build/libs/sp-blog-rest-api-0.0.1-SNAPSHOT-plain.jar /app/blog-app.jar

ENTRYPOINT ["java", "-jar", "blog-app.jar"]
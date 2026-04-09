
FROM markhobson/maven-chrome:jdk-17
WORKDIR /app
COPY . .
RUN mvn install -DskipTests
CMD ["mvn", "test"]
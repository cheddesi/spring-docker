# spring-docker
spring docker basic demo - config test drive with aws ecs

# lazy notes

-Dspring.config.location=your.properties
spring.profiles.active=prod
mvn -Dspring.profiles.active=prod clean spring-boot:run 

mvn clean spring-boot:run --spring.profiles.active=prod

java -jar target/gs-spring-boot-docker-0.1.0.jar --spring.profiles.active=prod
java -jar target/gs-spring-boot-docker-0.1.0.jar --spring.config.location=file:D:/Users/cheddes/Documents/work/Docker/gitws/config-home/app1/application-test.yml

docker run --rm -v c:/Users:/data alpine ls /data


docker build -t cheddesi/spring-service:latest . 
docker images
Start the app with default config file:
docker run -p 8081:8080 -v D:/Users/cheddes/Documents/work/Docker/gitws/config-home:/tmp --name siva cheddesi/spring-service:latest

Start the app with test environment config file (override the location with environment variable)
docker run -p 8081:8080 -v D:/Users/cheddes/Documents/work/Docker/gitws/config-home:/tmp --name siva -e FILE_PATH=file:/tmp/app1/application-test.yml cheddesi/spring-service:latest

All config files are on host at D:/Users/cheddes/Documents/work/Docker/gitws/config-home

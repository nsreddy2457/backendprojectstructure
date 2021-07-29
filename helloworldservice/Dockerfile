FROM openjdk:11-jre-slim-sid

WORKDIR	 /home/helloworldservice
COPY target/helloworldservice.jar helloworldservice.jar

EXPOSE 80

CMD java -jar helloworldservice.jar
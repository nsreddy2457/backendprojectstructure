FROM openjdk:11-jre-slim-sid

WORKDIR	 /home/helloworldservice
COPY target/helloworldservice.jar helloworldservice.jar

EXPOSE 9990

CMD java -jar helloworldservice.jar
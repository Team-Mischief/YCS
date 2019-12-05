FROM ubuntu:latest
RUN \
# Update
apt-get update -y && \
# Install Java
apt-get install default-jre -y

ADD ./target/gateway-0.0.1-SNAPSHOT.jar gateway.jar

EXPOSE 9000

CMD java -jar gateway.jar
FROM ubuntu:latest
RUN \
# Update
apt-get update -y && \
# Install Java
apt-get install default-jre -y

ADD ./target/discovery-0.0.1-SNAPSHOT.jar discovery.jar

EXPOSE 8761

CMD java -jar discovery.jar
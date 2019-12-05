FROM ubuntu:latest
RUN \
# Update
apt-get update -y && \
# Install Java
apt-get install default-jre -y

ADD ./target/code-0.0.1-SNAPSHOT.jar code.jar

EXPOSE 8761

CMD java -jar code.jar
FROM ubuntu:latest
RUN \
# Update
apt-get update -y && \
# Install Java
apt-get install default-jre -y

ADD ./target/rating-0.0.1-SNAPSHOT.jar rating.jar

EXPOSE 8761

CMD java -jar rating.jar
FROM debian:stable
RUN apt-get update
RUN apt-get install -y openjdk-11-jdk \
	curl

RUN useradd -ms /bin/bash admin
USER admin

WORKDIR /app
EXPOSE 4040
COPY /app/target/hello-0.1.jar /app/hello-0.1.jar
CMD java -jar hello-0.1.jar
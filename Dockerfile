FROM bellsoft/liberica-openjdk-alpine:latest
COPY ./src ./java
RUN mkdir ./out
RUN javac -sourcepath ./java -d out /java/Homeworks/hw1/Main.java
CMD java -classpath ./out Homeworks.hw1.Main
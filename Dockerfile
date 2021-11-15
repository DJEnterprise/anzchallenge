FROM openjdk:9

RUN mkdir /opt/apps/anzchallenge

COPY /build/libs/anzchallenge-1.0.0.jar /opt/apps/anzchallenge/

WORKDIR /opt/apps/anzchallenge

RUN java -jar anzchallenge-1.0.0.jar
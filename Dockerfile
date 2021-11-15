FROM openjdk:9

COPY /build/libs/anzchallenge-*.jar /opt/apps/anzchallenge/

WORKDIR /opt/apps/anzchallenge

EXPOSE 8080:80
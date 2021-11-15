FROM openjdk:9

COPY /build/libs/anzchallenge-*.jar /opt/apps/anzchallenge/

WORKDIR /opt/apps/anzchallenge

EXPOSE 8080:80

CMD java -jar anzchallenge-1.0.0.jar
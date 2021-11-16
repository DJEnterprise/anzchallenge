FROM openjdk:9

EXPOSE 80/tcp

RUN adduser --system --home /opt/apps/anzchallenge anz

USER anz

COPY /build/libs/anzchallenge-*.jar /opt/apps/anzchallenge/

WORKDIR /opt/apps/anzchallenge

CMD java -Xms128m -Xmx256m -jar anzchallenge-1.0.0.jar > anzchallenge.log

#CMD java -jar anzchallenge-1.0.0.jar
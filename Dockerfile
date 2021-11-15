FROM openjdk:9

EXPOSE 8080/tcp

RUN adduser --system --home-dir /opt/apps anz

USER anz

COPY /build/libs/anzchallenge-*.jar /opt/apps/anzchallenge/

WORKDIR /opt/apps/anzchallenge

CMD java -XX:+UseG1GC -XX:+UseStringDeduplication -XX:+PrintStringDeduplicationStatistics -Xms2g -Xmx4g -jar anzchallenge-1.0.0.jar > anzchallenge.log 2>&1
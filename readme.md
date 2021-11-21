ANZ Challenge Application
=====

This Application is built in spring boot web framework and provide rest interface to ANZ Challenge application.

Runs on port 8085. Please update server.port in application.properties to run on a different port.

Requirements
------------

Java - version 1.8
Java - version 11 required for sonarqube code analysis 

Build
---------

./gradlew build

Run
----

./gradlew bootRun

SonarQube
----

./gradlew -Dsonar.host.url=http://localhost:9000 -Dsonar.login=$Auth_token sonarqube
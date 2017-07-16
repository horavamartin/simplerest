FROM maven:3.5.0-jdk-7-alpine as BUILD

MAINTAINER Martin Horava <horavamartin@gmail.com>

ENV APP_PATH=/tmp/simplerest

COPY src $APP_PATH
COPY pom.xml $APP_PATH

RUN mvn -f $APP_PATH/pom.xml clean install

FROM jboss/wildfly:10.1.0.Final

ENV APP_PATH=/tmp/simplerest

COPY --from=BUILD $APP_PATH/targect/simplerest.war /opt/jboss/wildfly/standalone/deployments/simplerest.war

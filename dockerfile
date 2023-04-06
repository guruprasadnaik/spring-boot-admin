FROM tomcat:9
WORKDIR /usr/local/tomcat/webapps/

RUN \
  mv /usr/local/tomcat/webapps /usr/local/tomcat/webapps2 && \
  mv /usr/local/tomcat/webapps.dist /usr/local/tomcat/webapps

ADD /build/libs/trident.war /usr/local/tomcat/webapps/

EXPOSE 8080
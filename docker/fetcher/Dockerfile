FROM ubuntu:14.04
MAINTAINER Chain Yu "yujnln@gmail.com"
ENV REFRESHED_AT 2018-09-10


RUN apt-get -yqq update
RUN apt-get -yqq install wget

VOLUME [ "/var/lib/tomcat7/webapps/" ]
WORKDIR   /var/lib/tomcat7/webapps/

ENTRYPOINT [ "wget" ]
CMD ["-?"]


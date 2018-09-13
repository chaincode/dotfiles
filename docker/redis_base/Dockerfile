FROM ubuntu:14.04
MAINTAINER Chain Yu "yujnln@gmail.com"
ENV REFRESHED_AT 2018-09-10


RUN apt-get -yqq update
RUN apt-get -yqq install software-properties-common python-software-properties
RUN add-apt-repository ppa:chris-lea/redis-server

RUN apt-get clean
RUN rm -rf /var/lib/apt/lists/* -vf
RUN apt-get -yqq update
RUN apt-get -yqq install redis-server redis-tools


VOLUME [ "/var/lib/redis", "/var/log/redis" ]

EXPOSE 6379

CMD []


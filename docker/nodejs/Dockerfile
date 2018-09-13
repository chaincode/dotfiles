FROM ubuntu:14.04
MAINTAINER Chain Yu "yujnln@gmail.com"
ENV REFRESHED_AT 2018-09-10


RUN apt-get -yqq update
RUN apt-get -yqq install nodejs npm
RUN ln -s /usr/bin/nodejs /usr/bin/node
RUN mkdir -p /var/log/nodeapp

ADD nodeapp /opt/nodeapp/

WORKDIR /opt/nodeapp


RUN npm config set strict-ssl false
RUN npm install
RUN npm config set strict-ssl true

VOLUME [ "/var/log/nodeapp" ]

EXPOSE 3000

ENTRYPOINT [ "nodejs", "server.js" ]


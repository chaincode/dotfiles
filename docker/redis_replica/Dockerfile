FROM yuukir/redis:base
MAINTAINER Chain Yu "yujnln@gmail.com"
ENV REFRESHED_AT 2018-09-10


ENTRYPOINT [ "redis-server", "--logfile /var/log/redis/redis-replica.log", "--slaveof redis_master 6379" ]


FROM ubuntu:16.04
MAINTAINER Chain Yu "yujnln@gmail.com"
ENV REFRESHED_AT 2018-09-09

#OPT 1 =ubuntu:14.04
#RUN apt-get -yqq update 
#RUN apt-get -yqq install ruby2.0 ruby2.0-dev make nodejs
#RUN apt-get -yqq install zlib1g-dev
#RUN which ruby
#RUN which gem
#RUN which ruby2.0
#RUN which gem2.0
#RUN rm /usr/bin/ruby
#RUN rm /usr/bin/gem
#RUN ln -s /usr/bin/ruby2.0 /usr/bin/ruby
#RUN ln -s /usr/bin/gem2.0 /usr/bin/gem
#RUN gem2.0 cleanup
#RUN gem2.0 install --no-rdoc --no-ri jekyll -v 2.5

#OPT 2=ubuntu:14.04
#RUN gpg --keyserver hkp://keys.gnupg.net --recv-keys 409B6B1796C275462A1703113804BB82D39DC0E3
#RUN curl -sSL https://get.rvm.io | bash -s stable --rails
#RUN source ~/.rvm/scripts/rvm
#RUN rvm install 2.4
#RUN rvm use 2.4
#RUN gem install --no-rdoc --no-ri jekyll

#OPT 3=ubuntu:14.04
#RUN apt-get -yqq update 
#RUN apt-get -yqq install ruby2.0 ruby2.0-dev nodejs
#RUN ruby -v
#RUN cd /usr/bin/
#RUN ln -sf ruby2.0 ruby
#RUN ln -sf gem2.0 gem
#RUN ln -sf erb2.0 erb
#RUN ln -sf irb2.0 irb
#RUN ln -sf rake2.0 rake
#RUN ln -sf rdoc2.0 rdoc
#RUN ln -sf testrb2.0 testrb
#RUN gem sources -r https://rubygems.org/ gem sources -r https://ruby.taobao.org/
#RUN gem sources -a https://gems.ruby-china.com
#RUN sudo gem update --system
#RUN gem pristine --all
#RUN ruby -v
#RUN gem install --no-rdoc --no-ri jekyll

#OPT 4=ubuntu:16.04
RUN apt-get -yqq update
RUN apt-get -yqq install build-essential
RUN apt-get -yqq install make

RUN apt-get -yqq install ruby-full ruby-dev nodejs
RUN apt-get -yqq install nodejs

RUN ruby -v
RUN gem sources --add https://gems.ruby-china.com/ --remove https://rubygems.org/  
RUN gem sources -l
RUN gem install jekyll



VOLUME /data  
VOLUME /var/www/html
WORKDIR /data

ENTRYPOINT [ "jekyll", "build", "--destination=/var/www/html" ]
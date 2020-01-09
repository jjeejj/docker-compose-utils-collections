FROM node:12.14.1-slim
LABEL maintainer="1048911681@qq.com"

RUN cd /home/yapi && \
    wget https://github.com/YMFE/yapi/archive/master.zip && \
    cd yapi-master && \
    npm i --production

WORKDIR /home/yapi/yapi-master
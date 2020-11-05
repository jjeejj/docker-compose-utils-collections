FROM node:12-alpine as builder

RUN apk add git python make openssl unzip gcc

RUN cd /home && wget https://github.com/jjeejj/yapi/archive/master.zip

RUN cd /home && unzip master.zip && mkdir /api && mv /home/yapi-master /api/vendors

RUN cd /api/vendors && \
    npm install --production --registry https://registry.npm.taobao.org

FROM node:12-alpine


ENV TZ="Asia/Shanghai" HOME="/"

WORKDIR ${HOME}

COPY --from=builder /api/vendors /api/vendors

COPY config.json /api/

EXPOSE 80

ENTRYPOINT ["node"]
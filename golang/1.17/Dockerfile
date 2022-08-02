FROM golang:1.17

LABEL maintainer="yibi <wwenjunjiang@qq.com>"

# 安装 必要的依赖包
USER root
RUN apt-get update && apt-get install -y \
  build-essential \
  ca-certificates \
  curl \
  git \
  gnupg \
  software-properties-common \
  zip \
  unzip \
  wget \
  && rm -rf /var/lib/apt/lists/*

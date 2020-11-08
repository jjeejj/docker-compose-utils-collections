docker run --rm --workdir /api -p 8089:80 \
-e VIRTUAL_PORT=80 -e VIRTUAL_HOST="yapi.app.h5no1.com"  \
--network nginx_default \
--name yapi-tuzhan yapi:tuzhan \
vendors/server/app.js
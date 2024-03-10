package com.xqj.nutrpc.core.server;

import io.vertx.core.Vertx;
import lombok.extern.slf4j.Slf4j;

/**
 * Vertx HTTP 服务器
 *
 * @author xqj
 * @date 2024/03/10
 */
@Slf4j
public class VertxHttpServer implements HttpServer {

    /**
     * 启动服务器
     *
     * @param port 端口
     */
    public void doStart(int port) {
        // 创建 Vert.x 实例
        Vertx vertx = Vertx.vertx();

        // 创建 HTTP 服务器
        io.vertx.core.http.HttpServer server = vertx.createHttpServer();

        // 监听端口并处理请求
        server.requestHandler(request -> {
            // 处理 HTTP 请求
            log.info("Received request:" + request.method() + " " + request.uri());

            // 发送 HTTP 响应
            request.response()
                    .putHeader("content-type", "text/plain")
                    .end("Hello from Vert.x Http server!");
        });

        // 启动 HTTP 服务器并监听指定端口
        server.listen(port, result -> {
            if (!result.succeeded()) {
                // 启动失败
                log.error("Failed to start server: " + result.cause());
            }
            log.info("Server is now listening on port: {}", port);
        });
    }
}

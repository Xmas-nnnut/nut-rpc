package com.xqj.nutrpc.core.server;

/**
 * HTTP 服务器接口
 *
 * @author xqj
 * @date 2024/03/10
 */
public interface HttpServer {

    /**
     * 启动服务器
     *
     * @param port 端口
     */
    void doStart(int port);
}

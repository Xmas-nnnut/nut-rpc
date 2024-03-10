package com.xqj.example.provider;

import com.xqj.example.common.service.UserService;
import com.xqj.nutrpc.core.registry.LocalRegistry;
import com.xqj.nutrpc.core.server.VertxHttpServer;
import com.xqj.nutrpc.core.server.HttpServer;

/**
 * 简易服务提供者示例
 *
 * @author xqj
 * @date 2024/03/10
 */
public class EasyProviderExample {

    public static void main(String[] args) {

        // 启动 web 服务
        HttpServer httpServer = new VertxHttpServer();
        httpServer.doStart(8080);
    }
}
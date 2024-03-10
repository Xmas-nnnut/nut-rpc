package com.xqj.nutrpc.core.proxy;

import java.lang.reflect.Proxy;

/**
 * 服务代理工厂（用于创建代理对象）
 *
 * @author xqj
 * @date 2024/03/10
 */
public class ServiceProxyFactory {

    /**
     * 获取代理
     * 根据服务类获取代理对象
     *
     * @param serviceClass 服务类
     * @return {@link T}
     */
    public static <T> T getProxy(Class<T> serviceClass) {
        return (T) Proxy.newProxyInstance(
                serviceClass.getClassLoader(),
                new Class[]{serviceClass},
                new ServiceProxy());
    }

}
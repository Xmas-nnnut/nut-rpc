package com.xqj.example.common.service;

import com.xqj.example.common.model.User;

/**
 * 用户服务
 *
 * @author xqj
 * @date 2024/03/10
 */
public interface UserService {

    /**
     * 获取用户
     *
     * @param user 用户
     * @return 用户
     */
    User getUser(User user);

    /**
     * 新方法 - 获取数字
     */
    default short getNumber() {
        return 1;
    }
}

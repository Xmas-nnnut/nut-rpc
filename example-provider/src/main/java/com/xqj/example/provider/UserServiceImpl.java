package com.xqj.example.provider;

import com.xqj.example.common.model.User;
import com.xqj.example.common.service.UserService;

/**
 * 用户服务实现类
 *
 * @author xqj
 * @date 2024/03/10
 */
public class UserServiceImpl implements UserService {

    public User getUser(User user) {
        System.out.println("用户名：" + user.getName());
        return user;
    }
}
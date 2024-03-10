package com.xqj.example.consumer;

import com.xqj.example.common.model.User;
import com.xqj.example.common.service.UserService;
import lombok.extern.slf4j.Slf4j;

/**
 * 简易服务消费者示例
 *
 * @author xqj
 * @date 2024/03/10
 */
@Slf4j
public class EasyConsumerExample {

    public static void main(String[] args) {
        // todo: 需要获取 UserService 的实现对象
        UserService userService = null;
        User user = new User();
        user.setName("我是坚果");
        // 调用
        for (int i = 0; i < 10; i++) {
            User newUser = userService.getUser(user);
            if (newUser != null) {
                System.out.println("我的名字是" + newUser.getName());
            } else {
                System.out.println("user == null");
            }
        }
        long number = userService.getNumber();
        System.out.println(number);

    }
}

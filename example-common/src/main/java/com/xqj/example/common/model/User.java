package com.xqj.example.common.model;

import java.io.Serializable;

/**
 * 用户
 *
 * @author xqj
 * @date 2024/03/10
 */
public class User implements Serializable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
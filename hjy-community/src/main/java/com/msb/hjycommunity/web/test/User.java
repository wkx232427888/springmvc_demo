package com.msb.hjycommunity.web.test;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

public class User implements Serializable {
    @NotNull(message="userId不能为空")
    private String userId;

    private String username;

    public User(String userId, String username) {
        this.userId = userId;
        this.username = username;
    }

    public User() {
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}

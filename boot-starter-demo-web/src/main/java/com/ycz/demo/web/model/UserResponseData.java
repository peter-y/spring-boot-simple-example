package com.ycz.demo.web.model;

import com.ycz.demo.api.ResponseData;
import com.ycz.demo.entity.User;

/**
 * ${description}.
 *
 * @author yuancz.
 * @version 2018/8/16 11:51
 */
public class UserResponseData extends ResponseData {

    private Long userId;
    private String username;
    private String password;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static UserResponseData from(User user) {
        UserResponseData responseData = new UserResponseData();
        responseData.setUserId(user.getUserId());
        responseData.setUsername(user.getUsername());
        responseData.setPassword(user.getPassword());
        return responseData;
    }
}

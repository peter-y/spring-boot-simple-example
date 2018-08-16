package com.ycz.demo.service;

import com.ycz.demo.entity.User;
import java.util.List;
import java.util.Optional;

/**
 * 用户接口声明.
 *
 * @author yuancz.
 * @version 2018/8/15 18:19
 */
public interface UserService {

    /**
     * 获取某个用户
     *
     * @param userId 用户id
     */
    public Optional<User> getUserById(Long userId);

    /**
     * 获取全部的用户
     */
    public Optional<List<User>> findAllUser();

    /**
     * 创建user
     * @param user
     */
    public User createUser(User user);
}

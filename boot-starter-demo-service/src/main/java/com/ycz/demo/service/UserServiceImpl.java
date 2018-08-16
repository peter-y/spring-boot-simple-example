package com.ycz.demo.service;


import com.ycz.demo.entity.User;
import com.ycz.demo.repositroy.UserRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * hello service.
 *
 * @author yuancz.
 * @version 2018/8/15 18:18
 */
@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Optional<User> getUserById(Long userId) {
        return userRepository.findById(userId);
    }

    @Override
    public Optional<List<User>> findAllUser() {
        List<User> userList = userRepository.findAll();
        return Optional.ofNullable(userList);
    }
}

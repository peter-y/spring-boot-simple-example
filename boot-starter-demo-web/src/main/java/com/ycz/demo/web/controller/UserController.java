package com.ycz.demo.web.controller;


import com.ycz.demo.api.ResponseData;
import com.ycz.demo.entity.User;
import com.ycz.demo.service.UserService;
import com.ycz.demo.web.model.UserRequestModel;
import com.ycz.demo.web.model.UserResponseData;
import java.util.Optional;
import javax.validation.constraints.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * user controller.
 *
 * @author yuancz.
 * @version 2018/8/15 18:17
 */
@RestController
@RequestMapping("/app")
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(value = "/user", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseData createUser(@RequestBody @NotNull UserRequestModel model) {
        // TODO: 2018/8/16 待处理
        return null;
    }

    @GetMapping("/user/{id}")
    public ResponseData hello(@PathVariable(name = "id") Long userId) {
        Optional<User> user = userService.getUserById(userId);
        if (!user.isPresent()) {
            logger.info("用户不存在");
            return null;
        }

        return UserResponseData.from(user.get());
    }
}

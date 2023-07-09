package com.roger.badminton.controller;

import com.roger.badminton.entity.User;
import com.roger.badminton.service.UserManagementService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @author Roger.li <br/>
 * @description
 */
@RestController
@RequestMapping("/users")
@Api(tags = "用户管理")
public class UserController {

    private final UserManagementService userManagementService;

    @Autowired
    public UserController(UserManagementService userManagementService) {
        this.userManagementService = userManagementService;
    }

    @GetMapping("/{userId}")
    @ApiOperation("根据用户ID获取用户信息")
    public User getUserById(@PathVariable Long userId) {
        return userManagementService.getUserById(userId);
    }

    @PostMapping
    @ApiOperation("创建用户")
    public void createUser(@RequestBody @Validated User user) {
        userManagementService.createUser(user);
    }

    @PutMapping("/{userId}")
    @ApiOperation("更新用户信息")
    public void updateUser(@PathVariable Long userId, @RequestBody @Validated User user) {
        user.setId(userId);
        userManagementService.updateUser(user);
    }

    @DeleteMapping("/{userId}")
    @ApiOperation("删除用户")
    public void deleteUser(@PathVariable Long userId) {
        userManagementService.deleteUser(userId);
    }
}


package com.roger.badminton.service.impl;

import com.roger.badminton.entity.User;
import com.roger.badminton.mapper.UserMapper;
import com.roger.badminton.service.UserManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Roger.li <br/>
 * @description
 */
@Service
public class UserManagementServiceImpl implements UserManagementService {

    private final UserMapper userMapper;

    @Autowired
    public UserManagementServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public User getUserById(Long userId) {
        return userMapper.selectById(userId);
    }

    @Override
    public void createUser(User user) {
        //打印user
        System.out.println(user);

        userMapper.insert(user);
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateById(user);
    }

    @Override
    public void deleteUser(Long userId) {
        userMapper.deleteById(userId);
    }
}


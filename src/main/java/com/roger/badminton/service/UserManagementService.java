package com.roger.badminton.service;

import com.roger.badminton.entity.User;

/**
 * @author Roger.li <br/>
 * @description
 */
public interface UserManagementService {
    /**
     * 根据用户ID获取用户信息
     *
     * @param userId 用户ID
     * @return 用户信息
     */
    User getUserById(Long userId);

    /**
     * 创建用户
     *
     * @param user 用户信息
     */
    void createUser(User user);

    /**
     * 更新用户信息
     *
     * @param user 用户信息
     */
    void updateUser(User user);

    /**
     * 删除用户
     *
     * @param userId 用户ID
     */
    void deleteUser(Long userId);
}


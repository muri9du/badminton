package com.roger.badminton;

import com.roger.badminton.entity.User;
import com.roger.badminton.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author Roger.li <br/>
 * @description
 */
@SpringBootTest
public class UserTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void test() {
        User user = new User();
        user.setWxOpenid("123");
        user.setWxNickname("Roger");
        user.setWxAvatar("https://rogerli.cn");
        userMapper.insert(user);
    }
}

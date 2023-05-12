package com.xls.demo2.mapper;

import com.xls.demo2.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserMapperTest {
@Autowired
private UserMapper userMapper;
    @Test
    void testInsert() {
        User user=new User();
        user.setSei("11");
        user.setMei("cba");
        userMapper.insert(user);

    }
}
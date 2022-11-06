package com.hello.service;

import com.hello.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void add() {
        User user = new User();
        user.setName("zhang");
        userService.addUser(user);
    }

    @Test
    public void findAll() throws Exception {
        List<User> userList = userService.list();
        userList.forEach(System.out::println);
    }

    @Test
    public void findById() throws Exception {
        User user = userService.getById(1);
        System.out.println(user);
    }
}

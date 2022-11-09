package com.hello.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hello.entity.User;

import java.util.List;

public interface UserService extends IService<User> {

    Integer addUser(User user);

    List<User> selectLikeName(String name);

}

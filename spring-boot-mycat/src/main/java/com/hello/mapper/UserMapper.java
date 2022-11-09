package com.hello.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hello.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<User> {

    List<User> selectLikeName(@Param("name") String name);
}

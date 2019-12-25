package com.mapper;

import com.pojo.User;
//包是mapper的
import tk.mybatis.mapper.common.Mapper;
//和通用mapper整合起来
public interface UserMapper extends Mapper<User> {
}

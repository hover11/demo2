package com.mapper;

import com.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
   public User getnameandpwd(String username, String password);
}

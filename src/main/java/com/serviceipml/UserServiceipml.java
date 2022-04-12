package com.serviceipml;

import com.domain.User;
import com.mapper.UserMapper;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceipml implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User getnameandpwd(String username,String password) {
        return userMapper.getnameandpwd(username,password);
    }
}

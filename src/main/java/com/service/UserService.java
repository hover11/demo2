package com.service;

import com.domain.User;
import org.springframework.stereotype.Service;


public interface UserService {
    public User getnameandpwd(String username,String password);

}

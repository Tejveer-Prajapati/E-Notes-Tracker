package com.tej.service;

import com.tej.entity.User;

public interface UserService {
    public User saveUser(User user);
    
    public boolean existEmailCheck(String email);
}

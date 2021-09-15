package com.zj.service;

import com.zj.entity.User;

public interface UserService {
    int queryUserByName(User user);

    void insertUser(User user);
}

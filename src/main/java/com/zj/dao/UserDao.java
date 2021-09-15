package com.zj.dao;

import com.zj.entity.User;

public interface UserDao {
    User queryUserByName(String username);

    void insertUser(User user);
}

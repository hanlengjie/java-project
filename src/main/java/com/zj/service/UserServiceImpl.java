package com.zj.service;

import com.zj.dao.UserDao;
import com.zj.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public int queryUserByName(User user) {
        User user1= userDao.queryUserByName(user.getUsername());
        if (user1==null) return 2;
        if (user1.getPassword().equals(user.getPassword())==false) return 3;
        return 1;
    }

    @Override
    public void insertUser(User user) {
        userDao.insertUser(user);
    }
}

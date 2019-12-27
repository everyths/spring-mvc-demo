package org.jason.service.impl;

import org.jason.dao.UserDao;
import org.jason.entity.User;
import org.jason.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * //TODO
 *
 * @author: linhj
 * @Date: 2019/12/25 23:01
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public boolean login(String userName, String pwd) {
        User user = userDao.findByUserName(userName);
        if (user == null) {
            throw new RuntimeException("not find by userName");
        }

        if (!user.getPwd().equals(pwd)) {
            throw new RuntimeException("password error");
        }
        return true;
    }
}
package org.jason.dao;

import org.jason.entity.User;

/**
 * @author: jason
 * @Date: 2019/12/25 23:01
 */
public interface UserDao {

    User findByUserName(String uesrName);

}
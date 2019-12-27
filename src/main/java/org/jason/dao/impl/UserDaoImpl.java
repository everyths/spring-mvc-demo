package org.jason.dao.impl;

import java.util.List;
import java.util.Map;
import org.jason.dao.UserDao;
import org.jason.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * //TODO
 *
 * @author: linhj
 * @Date: 2019/12/25 23:02
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public User findByUserName(String userName) {
        String sql = "select id, user_Name as userName, pwd from t_user where user_name = ?";
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql, userName);
        if (maps == null || maps.size() ==0) {
            return null;
        }

        if (maps.size() > 1) {
            throw new RuntimeException("except 1 but too many results");
        }
        return User.toUser(maps.get(0));
    }

}
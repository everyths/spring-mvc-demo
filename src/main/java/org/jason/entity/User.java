package org.jason.entity;

import java.util.Map;
import lombok.Data;

/**
 * //TODO
 *
 * @author: linhj
 * @Date: 2019/12/25 23:02
 */
@Data
public class User {

    private Long id;

    private String userName;

    private String pwd;

    public static User toUser(Map<String, Object> map) {
        User user = new User();
        user.setId((Long) map.get("id"));
        user.setUserName((String) map.get("userName"));
        user.setPwd((String) map.get("pwd"));
        return user;
    }
}
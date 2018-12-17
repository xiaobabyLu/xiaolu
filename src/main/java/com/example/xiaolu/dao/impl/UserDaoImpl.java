package com.example.xiaolu.dao.impl;

import com.example.xiaolu.dao.UserDAO;
import com.example.xiaolu.mapper.UserMapper;
import com.example.xiaolu.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Lu Yufeng
 * @date 2018/12/4 下午7:53
 */
@Service
public class UserDaoImpl implements UserDAO {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryUser(Long userId) {
        User user = new User();
        user = userMapper.selectByPrimaryKey(userId);

        return user;
    }
}

package com.example.xiaolu.dao;

import com.example.xiaolu.model.User;

/**
 * @author Lu Yufeng
 * @date 2018/12/4 下午7:52
 */
public interface UserDAO {

    User queryUser(Long userId);

}

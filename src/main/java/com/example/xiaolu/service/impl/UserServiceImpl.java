package com.example.xiaolu.service.impl;

import com.example.xiaolu.dao.UserDAO;
import com.example.xiaolu.model.User;
import com.example.xiaolu.service.UserService;
import com.example.xiaolu.vo.UserVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Lu Yufeng
 * @date 2018/12/4 下午8:02
 */

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDAO userDAO;


    @Override
    public UserVO getUSer(Long id) {
        User user = new User();

        UserVO userVO = new UserVO();

        user = userDAO.queryUser(id);

        BeanUtils.copyProperties(user,userVO);

        return userVO;
    }
}

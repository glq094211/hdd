package com.hdd.service.impl;

import com.hdd.dao.UserRepository;
import com.hdd.entity.User;
import com.hdd.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by 格调 on 2019/6/12.
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserRepository userRepository;
    @Override
    public User findByUserName(String userName) {
        return userRepository.findByUserName(userName);
    }
}

package com.hdd.service;

import com.hdd.entity.User;

/**
 * Created by 格调 on 2019/6/12.
 */
public interface UserService {
    User findByUserName(String userName);
}

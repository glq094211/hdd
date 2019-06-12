package com.hdd.service;

import com.hdd.entity.LoginResult;

/**
 * Created by 格调 on 2019/6/12.
 */
public interface LoginService {
    LoginResult login(String userName, String password);
    void logout();
}

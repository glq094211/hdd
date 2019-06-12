package com.hdd.entity;

/**
 * Created by 格调 on 2019/6/12.
 */
public class LoginResult {
    private boolean isLogin = false;
    private String result;

    public boolean isLogin() {
        return isLogin;
    }

    public void setLogin(boolean login) {
        isLogin = login;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}

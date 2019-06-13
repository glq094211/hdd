package com.hdd.controller;

import com.hdd.entity.LoginResult;
import com.hdd.entity.User;
import com.hdd.service.LoginService;
import org.apache.shiro.SecurityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * Created by 格调 on 2019/6/12.
 */
@Controller
public class HomeController {
    @Resource
    private LoginService loginService;

    @RequestMapping({"/","/index"})
    public String index(Model model){
        User principal = (User) SecurityUtils.getSubject().getPrincipal();
        model.addAttribute("user",principal);
        return "index";
    }

    @RequestMapping("/403")
    public String unauthorizedRole(){
        System.out.println("------没有权限-------");
        return "user/403";
    }

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String toLogin(Map<String, Object> map, HttpServletRequest request)
    {
        loginService.logout();
        return "user/login";
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(Map<String, Object> map,HttpServletRequest request,Model model) throws Exception{
        System.out.println("login()");
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");

        User principal = (User) SecurityUtils.getSubject().getPrincipal();
        System.out.println(principal);
        model.addAttribute("user",principal);

        LoginResult loginResult = loginService.login(userName,password);
        if(loginResult.isLogin())
        {
            return "index";
        }
        else {
            map.put("msg",loginResult.getResult());
            map.put("userName",userName);
            return "user/login";
        }
    }

    @RequestMapping("/logout")
    public String logOut(HttpSession session) {
        loginService.logout();
        return "user/login";
    }

}

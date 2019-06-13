package com.hdd.controller;

import com.hdd.entity.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 格调 on 2019/6/12.
 */

@Controller
@RequestMapping("/user")
public class UserController {
    /**
     * 用户查询.
     * @return
     */
    @RequestMapping("/userList")
    @RequiresPermissions("user:view")//权限管理;
    public String userInfo(Model model){

        return "user/userList";
    }

    /**
     * 用户添加;
     * @return
     */
    @RequestMapping("/userAdd")
    @RequiresPermissions("user:add")//权限管理;
    public String userInfoAdd(){
        return "user/userAdd";
    }

    /**
     * 用户删除;
     * @return
     */
    @RequestMapping("/userDel")
    @RequiresPermissions("user:del")//权限管理;
    public String userDel(){
        return "user/userDel";
    }


    /**
     * 用户删除;
     * @return
     */
    @RequestMapping("/userUpdate")
    @RequiresPermissions("user:update")//权限管理;
    public String userUpdate(){
        return "user/userUpdate";
    }
}

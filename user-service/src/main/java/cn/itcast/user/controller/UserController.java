package cn.itcast.user.controller;

import cn.itcast.user.pojo.User;
import cn.itcast.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: dongjw26541
 * @Date: 2019/3/14 17:47
 * @Version 1.0
 */
@RestController
@RequestMapping("user")
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping("/{id}")
    public User querById(@PathVariable("id") Long id){
        return userService.querById(id);
    }

}

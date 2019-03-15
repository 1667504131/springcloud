package cn.itcast.user.service;

import cn.itcast.user.mapper.UserMapper;
import cn.itcast.user.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author: dongjw26541
 * @Date: 2019/3/14 17:53
 * @Version 1.0
 */
@Component
public class UserService {
    @Autowired
    private UserMapper userMapper;
    public User querById(Long id){
        return userMapper.selectByPrimaryKey(id);
    }
}

package cn.kgc.service.Impl;

import cn.kgc.mapper.UserMapper;
import cn.kgc.entity.User;
import cn.kgc.service.UserService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

/**
 * Created by mac on 2019/2/27.
 */
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public User findUserByPhoneAndPassword(User user) {
        User u = userMapper.findUserByPhoneAndPassword(user);

        return u;
    }

    @Override
    public int addUser(User user) {


        return userMapper.addUser(user);
    }

    @Override
    public int deleteUser(Integer id) {
        return userMapper.deleteUser(id);
    }

    @Override
    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }

    @Override
    public User queryOne(Integer id) {
        return userMapper.queryOne(id);
    }

    @Override
    public List<User> queryAll() {
        return userMapper.queryAll();
    }
}

package cn.kgc.service;

import cn.kgc.entity.User;

import java.util.List;

/**
 * Created by mac on 2019/2/27.
 */
public interface UserService {

     //       根据号码,密码查询用户,登录
     User findUserByPhoneAndPassword(User user);

    //    增加用户
    int addUser(User user);

    //    删除用户
    int deleteUser(Integer id);

    // 修改用户
    int updateUser(User user);


    User queryOne(Integer id);

    List<User> queryAll();

}

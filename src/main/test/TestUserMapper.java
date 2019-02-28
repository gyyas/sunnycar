import cn.kgc.entity.User;
import cn.kgc.mapper.UserMapper;
import cn.kgc.service.UserService;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;


/**
 * Created by mac on 2019/2/28.
 */
public class TestUserMapper {



    @Test
    public void selectOne() {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        SqlSessionFactory ssf = (SqlSessionFactory) context.getBean("sessionFactory");
        SqlSession ss = ssf.openSession();
        UserMapper userMapper = ss.getMapper(UserMapper.class);
        User user = userMapper.queryOne(1);
        System.out.println(user.toString());



    }

    @Test
    public void addUser() {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        SqlSessionFactory ssf  = (SqlSessionFactory)context.getBean("sessionFactory");
        SqlSession ss = ssf.openSession();
        UserMapper userMapper = ss.getMapper(UserMapper.class);
        User user=new User(null,"admin",1,"123456","13456781234");
        userMapper.addUser(user);
        ss.commit();



    }

   @Test
    public void delUser(){
       ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
       SqlSessionFactory ssf  = (SqlSessionFactory)context.getBean("sessionFactory");
       SqlSession ss = ssf.openSession();
       UserMapper userMapper = ss.getMapper(UserMapper.class);
       userMapper.deleteUser(2);
       ss.commit();



   }

    @Test
    public void selectAll() {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        SqlSessionFactory ssf  = (SqlSessionFactory)context.getBean("sessionFactory");
        SqlSession ss = ssf.openSession();
        UserMapper userMapper = ss.getMapper(UserMapper.class);
        List<User> list = userMapper.queryAll();
        for(User user:list){
            System.out.println(user.toString());
        }


    }

    @Test
    public void updateUser() {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        SqlSessionFactory ssf  = (SqlSessionFactory)context.getBean("sessionFactory");
        SqlSession ss = ssf.openSession();
        UserMapper userMapper = ss.getMapper(UserMapper.class);
        User user=new User(4,"admin",1,"123456","15720611978");
        userMapper.updateUser(user);
        ss.commit();

    }

    @Test
    public void testFindUserByPhoneAndPassword() {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        SqlSessionFactory ssf  = (SqlSessionFactory)context.getBean("sessionFactory");
        SqlSession ss = ssf.openSession();
        UserMapper userMapper = ss.getMapper(UserMapper.class);
        User user=new User(null,null,null,"123456","15720611978");
        User u = userMapper.findUserByPhoneAndPassword(user);
        System.out.println(u.toString());

    }


}

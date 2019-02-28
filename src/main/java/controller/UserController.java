package controller;

import cn.kgc.entity.User;
import cn.kgc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by mac on 2019/2/28.
 */

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    //正常访问login页面
    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    //表单提交过来的路径
    @RequestMapping(value = "/checkLogin",method = RequestMethod.GET)
    public String checkLogin(@RequestParam(value="phone") String phone, @RequestParam(value = "passWord")String passWord  , Model model) {

        //调用service方法
     User user=new User(null,null,null,passWord,phone);
        User u = userService.findUserByPhoneAndPassword(user);
        if(u!=null){
            model.addAttribute("user",u);
            return "index";

        }
      return "index";
    }

}

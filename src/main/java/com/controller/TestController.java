package com.controller;

import com.domain.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
    @Autowired
    UserService userService;
//    注意：通过浏览器的地址栏输入地址，所访问的URL都是get请求
//
//一. 浏览器会发送get请求的情况
//
//直接在浏览器地址栏输入某个地址
//点击链接
//表单默认的提交方式
//二.浏览器会发送post请求的情况
//
//设置表单method = “post”
    //还有controller的默认访问方法是get和post都行
    @RequestMapping(value = "/index")
    public  String returnindedx()
    {
        return "index";
    }
    @RequestMapping(value = "/login")
    public String login(String username,String password)
    {
     User user=userService.getnameandpwd(username,password);
     if(user!=null)
     {
         return "success";
     }
     else
     {
         return "falied";
     }
    }
    @RequestMapping(value = "/returnlogin")
    public  String returnlogin()
    {
        return "login";
    }
}

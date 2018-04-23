package hello.controller;

import hello.entity.User;
import hello.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by yang on 2018/1/29.
 */

@Controller
@RequestMapping("Hello")
public class HelloController {

    @Autowired
    HelloService helloService;


    @RequestMapping("select")
    public String selectUser(String name, HttpServletRequest request){
        User user = helloService.selectUser(name);
        request.getSession().setAttribute("user",user);
        return "/hello.jsp";
    }


}

package hello.controller;

import hello.entity.Display;
import hello.entity.User;
import hello.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by yang on 2018/5/8.
 */

@Controller
@RequestMapping("Login")
public class LoginController {

    @Autowired
    LoginService loginService;

    @RequestMapping("login")
    public String login(String name, String pwd,HttpServletRequest request){

        Display display = loginService.login(name, pwd);
        request.getSession().setAttribute("role",display.getRole());
        
        if (display.getRole()==null) {
            request.getSession().setAttribute("role","fall");
        }
//        System.out.println("display = " + display);
        return "redirect:/application/main.html";
    }


}

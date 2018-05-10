package hello.controller;

import hello.dao.AdminDao;
import hello.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by yang on 2018/5/10.
 */

@Controller
@RequestMapping("AdminController")
public class AdminController {


    @Autowired
    @Qualifier("AdminDao")
    AdminDao adminDao;

    @Resource
    Utils utils;


    @RequestMapping("showAdmins")
    public String showAdmins(HttpServletRequest request){
        utils.showMans(request,"admin");
        return "/application/adminmanage.jsp";
    }
}

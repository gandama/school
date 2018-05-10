package hello.controller;

import hello.dao.StudentDao;
import hello.entity.Teacher;
import hello.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by yang on 2018/5/10.
 */
@Controller
@RequestMapping("StudentController")
public class StudentController {

    @Autowired
    @Qualifier("StudentDao")
    StudentDao studentDao;


    @Resource
    Utils utils;

    @RequestMapping("showStudents")
    public String showStudents(HttpServletRequest request){
        utils.showMans(request,"student");
        return "/application/studentmanage.jsp";

    }
}

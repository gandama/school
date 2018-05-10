package hello.controller;

import hello.dao.TeacherDao;
import hello.entity.Teacher;
import hello.utils.Utils;
import org.mybatis.spring.annotation.MapperScan;
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
@RequestMapping("TeacherController")
public class TeacherController {


    @Autowired
    @Qualifier("TeacherDao")
    TeacherDao teacherDao;

    @Resource
    Utils utils;


    @RequestMapping("showTeachers")
    public String showTeachers(HttpServletRequest request){
        utils.showMans(request,"teacher");
        return "/application/right.jsp";
    }
}

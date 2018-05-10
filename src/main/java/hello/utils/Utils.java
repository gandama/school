package hello.utils;

import hello.dao.AdminDao;
import hello.dao.HelloDao;
import hello.dao.StudentDao;
import hello.dao.TeacherDao;
import hello.entity.Admin;
import hello.entity.Display;
import hello.entity.Student;
import hello.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by yang on 2018/5/10.
 */

@Component
public  class Utils {

    @Autowired
    @Qualifier("AdminDao")
    AdminDao adminDao;
    @Autowired
    @Qualifier("StudentDao")
    StudentDao studentDao;
    @Autowired
    @Qualifier("TeacherDao")
    TeacherDao teacherDao;


    public void  showMans(HttpServletRequest request,String selectrole){
        String pageStr=request.getParameter("page");
        int pageNow=1;
        if (pageStr != null) {
            pageNow=Integer.parseInt(pageStr);
        }
        request.getSession().setAttribute("pageNow",pageNow);
        int num=9*(pageNow-1);


        int totalCount=0;
        if("admin".equals(selectrole)){
            List<Admin> admins = adminDao.selectall(num);
            request.getSession().setAttribute("users",admins);
            totalCount = adminDao.selectcount();
        }
        if("student".equals(selectrole)){
            ArrayList<Student> students = studentDao.selectall(num);
            request.getSession().setAttribute("users",students);
            totalCount = studentDao.selectcount();
        }
        if("teacher".equals(selectrole)){
            ArrayList<Teacher> teachers = teacherDao.selectall(num);
            request.getSession().setAttribute("users",teachers);
            totalCount = teacherDao.selectcount();
        }

        int totalPage=(int) Math.ceil(totalCount*1.0/9);
        request.getSession().setAttribute("totalCount",totalCount);
        request.getSession().setAttribute("totalPage",totalPage);

    }
}

package hello.controller;

import hello.dao.StudentDao;
import hello.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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

    @RequestMapping("showTeachers")
    public String showStudents(HttpServletRequest request){

        String pageStr=request.getParameter("page");
        int pageNow=1;
        if (pageStr != null) {
            pageNow=Integer.parseInt(pageStr);
        }
        request.getSession().setAttribute("pageNow",pageNow);
        int num=9*(pageNow-1);
        List<Teacher> users = studentDao.selectall(num);
        request.getSession().setAttribute("users",users);
        int totalCount = studentDao.selectcount();
//        System.out.println("totalCount = " + totalCount);
        int totalPage=(int) Math.ceil(totalCount*1.0/9);
        request.getSession().setAttribute("totalCount",totalCount);
        request.getSession().setAttribute("totalPage",totalPage);
        return "/application/right.jsp";

    }
}

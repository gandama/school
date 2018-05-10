package hello.utils;

import hello.dao.AdminDao;
import hello.dao.HelloDao;
import hello.dao.StudentDao;
import hello.dao.TeacherDao;
import hello.entity.Display;
import hello.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by yang on 2018/5/10.
 */
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
    @Autowired
    @Qualifier("HelloDao")
    HelloDao helloDao;

    public static Display showMans(HttpServletRequest request){
        String pageStr=request.getParameter("page");
        int pageNow=1;
        if (pageStr != null) {
            pageNow=Integer.parseInt(pageStr);
        }
        request.getSession().setAttribute("pageNow",pageNow);
        int num=9*(pageNow-1);

//        request.getSession()

//        List<Teacher> users = teacherDao.selectall(num);
//        request.getSession().setAttribute("users",users);
//        int totalCount = teacherDao.selectcount();
////        System.out.println("totalCount = " + totalCount);
//        int totalPage=(int) Math.ceil(totalCount*1.0/9);
//        request.getSession().setAttribute("totalCount",totalCount);
//        request.getSession().setAttribute("totalPage",totalPage);


        return null;
    }
}

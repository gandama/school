package hello.service;

import hello.dao.AdminDao;
import hello.dao.HelloDao;
import hello.dao.StudentDao;
import hello.dao.TeacherDao;
import hello.entity.Admin;
import hello.entity.Display;
import hello.entity.Teacher;
import hello.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by yang on 2018/5/8.
 */

@Service
public class LoginService {

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
    Display display;

    public Display login(String name,String pwd){
        Admin admin = adminDao.selectAdmin(name, pwd);
        display=new Display();
        if (admin != null) {
            display.setName(admin.getMname());
            display.setPwd(admin.getMpwd());
            display.setId(admin.getId());
            display.setRole("admin");
        }
        return display;

    }
}

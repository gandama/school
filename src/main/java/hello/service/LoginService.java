package hello.service;

import hello.dao.AdminDao;
import hello.dao.HelloDao;
import hello.dao.StudentDao;
import hello.dao.TeacherDao;
import hello.entity.*;
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
        else {
            Teacher teacher = teacherDao.selectTeacher(name, pwd);
            if (teacher != null) {
                display.setName(teacher.getTname());
                display.setPwd(teacher.getTpwd());
                display.setId(teacher.getId());
                display.setRole("teacher");
            }
            else {
                Student student = studentDao.selectStudent(name, pwd);
                if (student != null) {
                    display.setName(student.getSname());
                    display.setPwd(student.getSpwd());
                    display.setId(student.getId());
                    display.setRole("student");
                }
            }
        }
        return display;

    }
}

package hello.dao;

import hello.entity.Admin;
import hello.entity.Student;
import hello.entity.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

/**
 * Created by yang on 2018/5/8.
 */
@MapperScan
@Component("StudentDao")
public interface StudentDao {

    @Select("select * from student where sname=#{sname} and spwd=#{spwd}")
    public Student selectStudent(@Param("sname") String sname, @Param("spwd") String spwd);


    @Select("select * from student limit #{num},9")
    public ArrayList<Student> selectall(@Param("num") int num);

    @Select("select count(*) from student")
    public int selectcount();
}

package hello.dao;

import hello.entity.Admin;
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
@Component("TeacherDao")
public interface TeacherDao {

    @Select("select * from teacher where tname=#{tname} and tpwd=#{tpwd}")
    public Teacher selectTeacher(@Param("tname") String tname, @Param("tpwd") String tpwd);

    @Select("select * from teacher limit #{num},9")
    public ArrayList<Teacher> selectall(@Param("num") int num);

    @Select("select count(*) from teacher")
    public int selectcount();

}

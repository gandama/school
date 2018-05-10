package hello.dao;

import hello.entity.Admin;
import hello.entity.Teacher;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Component;

/**
 * Created by yang on 2018/5/8.
 */
@MapperScan
@Component("TeacherDao")
public interface TeacherDao {

    @Select("select * from teacher where tname=#{name}")
    public Teacher selectTeacher(String name);

}

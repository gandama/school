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
@Component("AdminDao")
public interface AdminDao {

    @Select("select * from admin where mname=#{mname} and mpwd=#{mpwd}")
    public Admin selectAdmin(@Param("mname") String mname, @Param("mpwd") String mpwd);

    @Select("select * from admin limit #{num},9")
    public ArrayList<Admin> selectall(@Param("num") int num);

    @Select("select count(*) from admin")
    public int selectcount();
}

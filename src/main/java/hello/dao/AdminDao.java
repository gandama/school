package hello.dao;

import hello.entity.Admin;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Component;

/**
 * Created by yang on 2018/5/8.
 */
@MapperScan
@Component("AdminDao")
public interface AdminDao {

    @Select("select * from admin where mname=#{mname} and mpwd=#{mpwd}")
    public Admin selectAdmin(@Param("mname") String mname, @Param("mpwd") String mpwd);
}

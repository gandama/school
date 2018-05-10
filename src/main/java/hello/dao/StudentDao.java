package hello.dao;

import hello.entity.Admin;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Component;

/**
 * Created by yang on 2018/5/8.
 */
@MapperScan
@Component("StudentDao")
public interface StudentDao {

    @Select("select * from admin where sname=#{name} and spwd=#{pwd}")
    public Admin selectAdmin(String name, String pwd);
}

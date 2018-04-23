package hello.dao;

import hello.entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Component;

/**
 * Created by yang on 2018/1/29.
 */

@MapperScan
@Component("HelloDao")
public interface HelloDao {

    @Insert("insert into user values(name=#{name},pssword=#{password},sex=#{sex},hobbys=#{hobbys})")
    public void insertUser(User user);


    @Delete("delete from user where name=#{name}")
    public void deleteUser(@Param("name") String name);

    public void UpDateUser();

    @Select("select * from user where name=#{name}")
    public User selectUser(String name);

}

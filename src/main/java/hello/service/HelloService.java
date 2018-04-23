package hello.service;

import hello.dao.HelloDao;
import hello.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by yang on 2018/1/29.
 */

@Service
public class HelloService {

    @Autowired
    @Qualifier("HelloDao")
    HelloDao helloDao;

    public User selectUser(String name){
        User user = helloDao.selectUser(name);
        return user;
    }
}

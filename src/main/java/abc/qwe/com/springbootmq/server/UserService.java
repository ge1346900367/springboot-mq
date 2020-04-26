package abc.qwe.com.springbootmq.server;

import abc.qwe.com.springbootmq.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService {

    @Autowired
    UserMapper userMapper;

    public void findById() {

        System.out.println();
    }

}

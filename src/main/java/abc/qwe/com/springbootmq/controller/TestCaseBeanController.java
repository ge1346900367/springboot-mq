package abc.qwe.com.springbootmq.controller;

import abc.qwe.com.springbootmq.testbean.B;
import abc.qwe.com.springbootmq.testbean.C;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("test")
@RestController
public class TestCaseBeanController {

    @Autowired
    B b;

    @Autowired
    C c;

    @Autowired
    @Qualifier("ccc")
    C ccc;


    @RequestMapping("aa")
    public void aa() {
        System.out.println(c+"controller中自动注入的"+System.identityHashCode(c));
        System.out.println(ccc+""+System.identityHashCode(ccc));
        b.testA();
        System.out.println("--------------------------");
        b.testB();
        System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

}
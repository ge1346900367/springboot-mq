package abc.qwe.com.springbootmq.testbean;

import org.springframework.beans.factory.annotation.Autowired;

public class A {


    @Autowired
    C c;

    public String testA() {
        System.out.println(c+"A类中的自动注入的"+System.identityHashCode(c));
        System.out.println("testA方法的执行。。。。。。。。。。。。。。。。");
        return "abcd";
    }

}
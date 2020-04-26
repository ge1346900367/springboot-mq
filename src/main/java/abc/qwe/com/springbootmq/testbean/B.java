package abc.qwe.com.springbootmq.testbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class B extends A{

    @Autowired
    C c;

    @Bean("ccc")
    public C newcad () {
        return new C("张三","666666");
    }

    public String testB() {
        System.out.println(c+"B类中的自动注入的"+System.identityHashCode(c));
        System.out.println("testB的执行。。。。。。。。。。。");
        return "123465";
    }
}
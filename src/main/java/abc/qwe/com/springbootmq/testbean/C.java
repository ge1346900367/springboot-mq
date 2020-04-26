package abc.qwe.com.springbootmq.testbean;

import org.springframework.stereotype.Component;

@Component
public class C {
    private String name;
    private String password;

    public C () {

    }

    public C(String name, String password) {
        this.name = name;
        this.password = password;
    }

    @Override
    public String toString() {
        return "C{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
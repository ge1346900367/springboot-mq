package abc.qwe.com.springbootmq;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRabbit
@MapperScan("abc.qwe.com.springbootmq.mapper")
public class SpringbootMqApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMqApplication.class, args);

    }

}

package individual.professortao.example;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


//@Configuration。标注一个类为配置类。
//@EnableAutoConfiguration。开启自动配置。
//@SpringBootApplication。等价于以默认属性使用@Configuration，@EnableAutoConfiguration和@ComponentScan。


@EnableScheduling
@SpringBootApplication
public class WebApiDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebApiDemoApplication.class, args);
    }

}

package web;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/8/24.
 */
@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class BbsDeamon extends SpringBootServletInitializer {

    @RequestMapping("/")
    public String index() {
        return "欢迎光临小春论坛!";
    }

    public static void main(String[] args) {
        SpringApplication.run(BbsDeamon.class, args);
    }
}

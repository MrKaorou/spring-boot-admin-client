package web;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/8/24.
 */
@RestController
@EnableAutoConfiguration
public class BbsDeamon {

    @RequestMapping("/")
    public String index() {
        return "欢迎光临小春论坛!";
    }

    public static void main(String[] args) {
        SpringApplication.run(BbsDeamon.class, args);
    }
}

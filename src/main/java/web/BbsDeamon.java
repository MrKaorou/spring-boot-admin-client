package web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * demo
 * @author mihao
 * @date 2018-3-26
 * @version 1.0
 */
@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class BbsDeamon extends SpringBootServletInitializer {

    @RequestMapping("/")
    public String index() {
        return "你好！我是8001";
    }

    public static void main(String[] args) {
        SpringApplication.run(BbsDeamon.class, args);
    }
}
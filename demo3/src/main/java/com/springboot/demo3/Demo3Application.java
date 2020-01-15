package com.springboot.demo3;


import com.springboot.demo3.configure.MydataSource;
import com.springboot.demo3.mapper.UserMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
//@EnableConfigurationProperties(MydataSource.class)
@MapperScan("com.springboot.demo3.mapper")
public class Demo3Application {
    @Autowired
    private MydataSource mydataSource;
    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return mydataSource.getHello()+","+","+mydataSource.getTtttt();

    }
    @GetMapping("/")
    @ResponseBody
    public String index(){
        return "hello world";
    }
    public static void main(String[] args) {
        SpringApplication.run(Demo3Application.class, args);
    }

}

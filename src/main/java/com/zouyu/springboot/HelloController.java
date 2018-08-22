package com.zouyu.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController("/")
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return  "66666666666666";
    }

    @RequestMapping("/hello2")
    public String hello2(){
        return  "xfffff";
    }
    @RequestMapping("/app")
    public App apphello(){

        App app = new App();
        app.setId(222);
        app.setName("xxx");
        app.setDate(new Date());
        return app;
    }
}

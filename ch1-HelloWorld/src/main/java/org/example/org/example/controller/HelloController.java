package org.example.org.example.controller;

import org.example.bean.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@ResponseBody
//@Controller
@RestController
public class HelloController {
    //spring的自动注入功能，配置一个car
    @Autowired
    Car car;

    @RequestMapping("/car")
    public Car car(){ return car;}

    @RequestMapping("/hello")
    public String handle1(){
        return "hello world!";
    }
}

package com.nuc.springweb.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Controller
public class HelloController {
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }



//查出数据在页面展示
    @RequestMapping("/succ")
    public String success(Map<String,String> map){
        map.put("hello","您好");
        return "success";
    }
}

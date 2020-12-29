package com.bjpowernode.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class IndexController {
    @RequestMapping(value = "/say")
    @ResponseBody
    public String say(){
        return "say: Hello SpringBoot!";
    }

    @RequestMapping(value = "/mapvalue")
    public @ResponseBody
    Map<String,Object> mapvalue(){
        Map<String,Object> retMap = new HashMap<String, Object>();
        retMap.put("message","SpringBoot Project");

        return retMap;
    }
}

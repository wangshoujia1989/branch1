package com.huawei.springboot04webrestfulcrud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Map;

@Controller
public class Helloworld {
    @ResponseBody
    @RequestMapping("/hello")
  public String sayhell(){

      return "helloworld";
  }

    @RequestMapping("/success")
    public String success(Map<String,Object> map) {
        map.put("hello","<h1>你好</h1>");
        map.put("users", Arrays.asList("zhangsan","lisi","wangwu"));

        return "success";
    }

}

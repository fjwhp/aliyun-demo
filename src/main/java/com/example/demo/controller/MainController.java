package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: TODO
 * @Author wuhp
 * @Date 2020/3/27
 **/
@RestController
public class MainController {

    @RequestMapping("/info")
    public String info(){
        String result=" this is demo alibaba ";
        return result;
    }
}

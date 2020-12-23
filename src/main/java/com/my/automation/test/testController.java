package com.my.automation.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangzuhao
 * @description:
 * @date: 2020/12/23 17:00
 */
@RestController
@RequestMapping("/test")
public class testController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}

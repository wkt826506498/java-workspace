package com.zhengqing.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
class DemoApplicationTests {

    @GetMapping(value = "/test")
    String contextLoads() {
        return "abcdefg";
    }

}

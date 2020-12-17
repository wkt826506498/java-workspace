package com.zhengqing.demo.modules.system.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TableController {

    @GetMapping(value = "/tableToWord", produces = "application/json;charset=utf-8", name = "导出数据库表信息生成Word")
    public String tableToWord() {
        return "test";
    }
}

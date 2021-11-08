package com.squash.rpc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Squash
 * @Data 2021/11/8 10:37
 */
@RestController
public class TestController {

    /**
     * 基礎測試
     * @return
     */
    @GetMapping("/test")
    public String test(){
        return "success";
    }
}

package com.imooc.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName ServerController
 * @Description TODO
 * @Author hxh
 * @Date 2020/5/12 10:28 下午
 * @Version 1.0
 */
@RestController
public class ServerController {

    @GetMapping("/msg")
    public String msg(){
        return "this is product msg1";
    }
}

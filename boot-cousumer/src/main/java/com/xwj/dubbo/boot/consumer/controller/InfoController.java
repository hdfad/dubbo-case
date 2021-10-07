package com.xwj.dubbo.boot.consumer.controller;

import com.xwj.dubbo.boot.parent.service.InfoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info")
public class InfoController {

    @Reference
    InfoService infoService;


    @GetMapping
    public String getConfigInfo(){
        String info = infoService.getInfo();
        return info;
    }
}

package com.xwj.dubbo.boot.provider.service.impl;

import com.xwj.dubbo.boot.parent.service.InfoService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

@Service
public class DemoServiceImpl implements InfoService {

    @Value("${dubbo.application.name}")
    private String serviceName;

    @Override
    public String getInfo() {
        return serviceName;
    }
}
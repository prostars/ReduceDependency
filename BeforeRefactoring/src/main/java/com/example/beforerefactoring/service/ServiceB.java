package com.example.beforerefactoring.service;

import com.example.beforerefactoring.Output;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class ServiceB {
    @Resource
    private ServiceC serviceC;

    public Integer methodB(Integer paramFirst) {
        Output.printf("'%d pass to ServiceC.' by ServiceB\n", paramFirst);
        return serviceC.methodC(paramFirst);
    }

    // other methods
}

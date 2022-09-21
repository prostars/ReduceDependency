package com.example.beforerefactoring.service;

import com.example.beforerefactoring.Output;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class ServiceC {
    @Resource
    private ServiceA serviceA;

    public Integer methodC(Integer first) {
        Output.printf("'return %d + %d(from ServiceA)' by ServiceC\n", first, serviceA.getValue());
        return first + serviceA.getValue();
    }

    // other methods
}

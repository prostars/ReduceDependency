package com.example.beforerefactoring.service;

import com.example.beforerefactoring.Output;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class ServiceA {
    @Resource
    ServiceB serviceB;

    public void methodA(Integer paramFirst) {
        Output.printf("'pass %d to ServiceB and get %s' by ServiceA\n", paramFirst, serviceB.methodB(paramFirst));
    }

    public Integer getValue() {
        return 10;
    }

    // other methods
}

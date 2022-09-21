package com.example.beforerefactoring;

import com.example.beforerefactoring.service.ServiceA;
import org.springframework.stereotype.Component;


@Component
public class Handler {
    private final ServiceA serviceA;

    public Handler(final ServiceA serviceA) {
        this.serviceA = serviceA;
    }

    public void execute(long count) {
        for (long cnt = 0; cnt < count; cnt++) {
            serviceA.methodA(2);
        }
    }
}

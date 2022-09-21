package com.example.afterrefactoring;

import com.example.afterrefactoring.service.ServiceA;
import com.example.afterrefactoring.service.ServiceB;
import com.example.afterrefactoring.service.ServiceC;
import org.springframework.stereotype.Component;


@Component
public class Handler {
    private final ServiceA serviceA;
    private final ServiceB serviceB;
    private final ServiceC serviceC;

    public Handler(final ServiceA serviceA, final ServiceB serviceB, final ServiceC serviceC) {
        this.serviceA = serviceA;
        this.serviceB = serviceB;
        this.serviceC = serviceC;
    }

    public void execute(long count) {
        for (long cnt = 0; cnt < count; cnt++) {
            serviceA.methodA(2, serviceB::methodB, serviceC::methodC);
        }
    }
}

package com.example.afterrefactoring;

import com.example.afterrefactoring.service.ServiceA;
import com.example.afterrefactoring.service.ServiceB;
import com.example.afterrefactoring.service.ServiceC;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

class SampleUnitTests {
    @Test
    public void testServiceB() {
        ServiceB serviceB = new ServiceB();

        Integer result = serviceB.methodB(2, () -> 10, (a, b) -> a + b.getAsInt());
        assertThat(result, equalTo(12));
    }

    @Test
    public void testHandler() {
        Handler handler = new Handler(new ServiceA(), new ServiceB(), new ServiceC());

        handler.execute(1);
    }
}

package com.example.beforerefactoring;

import com.example.beforerefactoring.service.ServiceB;
import com.example.beforerefactoring.service.ServiceC;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.when;


class UsingMockTests {
    @Mock
    private ServiceC serviceC;

    @InjectMocks
    private ServiceB serviceB;

    @InjectMocks
    private Handler handler;

    @BeforeEach
    public void createServiceB() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testServiceB() {
        int first = 10;
        when(serviceC.methodC(first)).thenReturn(first + 30);

        Integer result = serviceB.methodB(first);
        assertThat(result, equalTo(40));
    }

    @Test
    public void testHandler() {
        // 실패한다. 성공시키려면, ServerA, ServerB, ServerC 의존성에 대한 Mocking을 처리해야 한다.
        handler.execute(1);
    }
}

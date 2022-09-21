package com.example.beforerefactoring;

import com.example.beforerefactoring.service.ServiceB;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;


@SpringBootTest
class UsingSpringTests {
    @Resource
    ServiceB serviceB;

    @Resource
    Handler handler;

    @Test
    void testServiceB() {
        // 성공하지만, main()이 실행된 후라서 Output::isPrintable의 상태가 기본값이 아니다.
        Integer result = serviceB.methodB(2);
        assertThat(result, equalTo(12));
    }

    @Test
    void testHandler() {
        // 성공하지만, main()이 실행된 후라서 Output::isPrintable의 상태가 기본값이 아니다.
        handler.execute(1);
    }
}

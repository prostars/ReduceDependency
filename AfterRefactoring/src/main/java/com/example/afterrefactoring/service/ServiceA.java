package com.example.afterrefactoring.service;

import com.example.afterrefactoring.Output;
import com.example.afterrefactoring.TriFunction;
import org.springframework.stereotype.Service;

import java.util.function.BiFunction;
import java.util.function.IntSupplier;

@Service
public class ServiceA {
    public void methodA(Integer paramFirst,
                        TriFunction<Integer, IntSupplier, BiFunction<Integer, IntSupplier, Integer>, Integer> methodB,
                        BiFunction<Integer, IntSupplier, Integer> methodC) {
        Output.printf("'pass %d to ServiceB and get %s' by ServiceA\n",
            paramFirst, methodB.apply(paramFirst, this::getValue, methodC));
    }

    public Integer getValue() {
        return 10;
    }

    // other methods
}

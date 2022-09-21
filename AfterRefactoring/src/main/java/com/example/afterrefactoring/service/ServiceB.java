package com.example.afterrefactoring.service;

import com.example.afterrefactoring.Output;
import org.springframework.stereotype.Service;

import java.util.function.BiFunction;
import java.util.function.IntSupplier;

@Service
public class ServiceB {
    public Integer methodB(Integer paramFirst,
                           IntSupplier getValue,
                           BiFunction<Integer, IntSupplier, Integer> methodC) {
        Output.printf("'%d pass to ServiceC.' by ServiceB\n", paramFirst);
        return methodC.apply(paramFirst, getValue);
    }

    // other methods
}

package com.example.afterrefactoring.service;

import com.example.afterrefactoring.Output;
import org.springframework.stereotype.Service;

import java.util.function.IntSupplier;

@Service
public class ServiceC {
    public Integer methodC(Integer first, IntSupplier getValue) {
        Output.printf("'return %d + %d(from ServiceA)' by ServiceC\n", first, getValue.getAsInt());
        return first + getValue.getAsInt();
    }

    // other methods
}

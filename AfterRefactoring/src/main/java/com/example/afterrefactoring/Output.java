package com.example.afterrefactoring;

public class Output {
    public static boolean isPrintable = true;

    public static void printf(String format, Object... args) {
        if (isPrintable) {
            System.out.printf(format, args);
        }
    }
}

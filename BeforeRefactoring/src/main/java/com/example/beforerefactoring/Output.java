package com.example.beforerefactoring;

public class Output {
    public static boolean isPrintable = true;

    public static void printf(String format, Object... args) {
        if (isPrintable) {
            System.out.printf(format, args);
        }
    }
}

package com.example.beforerefactoring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.StopWatch;


@SpringBootApplication
public class BeforeRefactoringApplication implements CommandLineRunner {
    final Handler handler;

    public BeforeRefactoringApplication(final Handler handler) {
        this.handler = handler;
    }

    public static void main(String[] args) {
        SpringApplication.run(BeforeRefactoringApplication.class, args);
    }

    @Override
    public void run(final String... args) throws Exception {
        handler.execute(1);

        Output.isPrintable = false;
        StopWatch stopWatch = new StopWatch();

        for (int i = 0; i < 10; i++) {
            stopWatch.start();
            handler.execute(1_000_000L);
            stopWatch.stop();
            System.out.printf("TimeMillis : %d\n", stopWatch.getLastTaskTimeMillis());
        }
    }
}

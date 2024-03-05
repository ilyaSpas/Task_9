package org.example;


import java.util.concurrent.ForkJoinPool;

public class Main {
    public static void main(String[] args) {
        try (ForkJoinPool forkJoinPool = new ForkJoinPool()) {
            FactorialTask factorialTask = new FactorialTask(10L);

            System.out.println(forkJoinPool.invoke(factorialTask));
        }
    }
}
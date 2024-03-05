package org.example;

import java.util.concurrent.RecursiveTask;

public class FactorialTask extends RecursiveTask<Long> {
    private long i;

    public FactorialTask(long i) {
        this.i = i;
    }

    @Override
    protected Long compute() {
        if (i <= 1){
            return 1L;
        } else {
            FactorialTask factorialTask = new FactorialTask(i - 1L);
            factorialTask.fork();
            return i * factorialTask.join();
        }
    }
}

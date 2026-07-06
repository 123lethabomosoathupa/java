package com.mycompany.chapter17.snippet;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ClosingTime {

    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(2);
        threadPool.execute(new LongJob("Long Job"));
        threadPool.execute(new ShortJob("Short Job"));
        threadPool.shutdown();
        try {
            boolean finished = threadPool.awaitTermination(5, TimeUnit.SECONDS);
            System.out.println("Finished? " + finished);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        threadPool.shutdownNow();
    }
}

class LongJob implements Runnable {

    private final String name;

    public LongJob(String name) {
        this.name = name;
    }

    public void run() {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " finished");
    }
}

class ShortJob implements Runnable {

    private final String name;

    public ShortJob(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println(name + " finished");
    }
}

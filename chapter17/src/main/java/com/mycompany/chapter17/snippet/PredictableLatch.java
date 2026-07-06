package com.mycompany.chapter17.snippet;

import java.util.concurrent.*;

public class PredictableLatch {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        CountDownLatch latch = new CountDownLatch(1);
        executor.execute(() -> waitForLatchThenPrint(latch));
        System.out.println("back in main");
        latch.countDown();
        executor.shutdown();
    }

    private static void waitForLatchThenPrint(CountDownLatch latch) {
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("top o' the stack");
    }
}

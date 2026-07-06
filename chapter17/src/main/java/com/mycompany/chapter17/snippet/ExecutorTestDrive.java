package com.mycompany.chapter17.snippet;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorTestDrive {
  public static void main(String[] args) {
    ExecutorService executor =
      Executors.newSingleThreadExecutor();
    executor.execute(() ->
      System.out.println("top o' the stack"));
    System.out.println("back in main");
    executor.shutdown();
  }
}
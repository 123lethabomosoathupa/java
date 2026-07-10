package com.mycompany.chapter18.snippet;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class RyanAndMonicaAtomic {

    public static void main(String[] args) {
        AtomicBankAccount account = new AtomicBankAccount();
        AtomicRyanAndMonicaJob ryan = new AtomicRyanAndMonicaJob("Ryan", account, 50);
        AtomicRyanAndMonicaJob monica = new AtomicRyanAndMonicaJob("Monica", account, 100);
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.execute(ryan);
        executor.execute(monica);
        executor.shutdown();
    }
}

class AtomicRyanAndMonicaJob implements Runnable {

    private final String name;
    private final AtomicBankAccount account;
    private final int amountToSpend;

    AtomicRyanAndMonicaJob(String name, AtomicBankAccount account, int amountToSpend) {
        this.name = name;
        this.account = account;
        this.amountToSpend = amountToSpend;
    }

    public void run() {
        System.out.println(name + " is about to spend");
        account.spend(name, amountToSpend);
        System.out.println(name + " finishes spending");
    }
}

class AtomicBankAccount {

    private final AtomicInteger balance = new AtomicInteger(100);

    public int getBalance() {
        return balance.get();
    }

    public void spend(String name, int amount) {
        int initialBalance = balance.get();
        if (initialBalance >= amount) {
            boolean success = balance.compareAndSet(initialBalance, initialBalance - amount);
            if (!success) {
                System.out.println("Sorry " + name + ", you haven't spent the money.");
            }
        } else {
            System.out.println("Sorry, not enough for " + name);
        }
    }
}

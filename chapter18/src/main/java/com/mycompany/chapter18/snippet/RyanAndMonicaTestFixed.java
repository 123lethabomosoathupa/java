package com.mycompany.chapter18.snippet;

import java.util.concurrent.*;

public class RyanAndMonicaTestFixed {

    public static void main(String[] args) {
        SafeBankAccount account = new SafeBankAccount();
        SafeRyanAndMonicaJob ryan = new SafeRyanAndMonicaJob("Ryan", account, 50);
        SafeRyanAndMonicaJob monica = new SafeRyanAndMonicaJob("Monica", account, 100);
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.execute(ryan);
        executor.execute(monica);
        executor.shutdown();
    }
}

class SafeRyanAndMonicaJob implements Runnable {

    private final String name;
    private final SafeBankAccount account;
    private final int amountToSpend;

    SafeRyanAndMonicaJob(String name, SafeBankAccount account, int amountToSpend) {
        this.name = name;
        this.account = account;
        this.amountToSpend = amountToSpend;
    }

    public void run() {
        goShopping(amountToSpend);
    }

    private void goShopping(int amount) {
        System.out.println(name + " is about to spend");
        account.spend(name, amount);
        System.out.println(name + " finishes spending");
    }
}

class SafeBankAccount {

    private int balance = 100;

    public synchronized int getBalance() {
        return balance;
    }

    public synchronized void spend(String name, int amount) {
        if (balance >= amount) {
            balance = balance - amount;
            if (balance < 0) {
                System.out.println("Overdrawn!");
            }
        } else {
            System.out.println("Sorry, not enough for " + name);
        }
    }
}

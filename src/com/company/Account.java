package com.company;

import java.util.Random;

public class Account {
    private double balance;

    private int id;


    public void deposit(double amount) {
        balance += amount;
    }

    public String createId() {
        Random rnd = new Random();
        id = rnd.nextInt(999999);

        return String.format("%06d", id);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            throw new IllegalArgumentException("Withdrawal fails");
        }
    }

    public double getBalance() {
        return balance;
    }

    public int getId() {
        return id;
    }
}

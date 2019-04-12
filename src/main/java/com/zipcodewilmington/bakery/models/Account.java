package com.zipcodewilmington.bakery.models;

public class Account {
    long id;
    String name;
    Double balance;


    public Account() {
    }

    public Account(long id, String name, Double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}

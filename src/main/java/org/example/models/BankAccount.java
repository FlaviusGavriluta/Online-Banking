package org.example.models;

import org.example.enums.CurrencyType;

import java.util.UUID;

public abstract class BankAccount {
    protected final UUID id;
    protected double balance;
    protected CurrencyType currencyType;

    public BankAccount(double balance, CurrencyType currencyType) {
        this.id = UUID.randomUUID();
        this.balance = balance;
        this.currencyType = currencyType;
    }

    public abstract double calculateFee(double amount);

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public UUID getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public CurrencyType getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(CurrencyType currencyType) {
        this.currencyType = currencyType;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", balance=" + balance +
                ", currency='" + currencyType + '\'' +
                '}';
    }
}
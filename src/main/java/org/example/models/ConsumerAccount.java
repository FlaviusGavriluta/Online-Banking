package org.example.models;

import org.example.enums.CurrencyType;

public class ConsumerAccount extends BankAccount {
    public ConsumerAccount(double balance, CurrencyType currencyType) {
        super(balance, currencyType);
    }

    @Override
    public double calculateFee(double amount) {
        return amount * 0.01;
    }
}
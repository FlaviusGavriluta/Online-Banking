package org.example.models;

import org.example.enums.CurrencyType;

public class CorporateAccount extends BankAccount {
    public CorporateAccount(double balance, CurrencyType currencyType) {
        super(balance, currencyType);
    }

    @Override
    public double calculateFee(double amount) {
        return 0;
    }
}
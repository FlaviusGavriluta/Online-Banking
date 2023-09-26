package org.example.models;

import java.util.*;

public class Client {
    private final UUID id;
    private List<BankAccount> bankAccounts;

    public Client() {
        this.id = UUID.randomUUID();
        this.bankAccounts = new ArrayList<>();
    }

    public void addBankAccount(BankAccount bankAccount) {
        bankAccounts.add(bankAccount);
    }

    public UUID getId() {
        return id;
    }

    public List<BankAccount> getBankAccounts() {
        return bankAccounts;
    }

    public void setBankAccounts(List<BankAccount> bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", bankAccountMap=" + bankAccounts +
                '}';
    }
}
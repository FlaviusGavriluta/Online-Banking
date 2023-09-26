package org.example.models;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private static Bank instance = new Bank();

    private List<Client> clients;

    public Bank() {
        this.clients = new ArrayList<>();
    }

    public void addClient(Client client) {
        clients.add(client);
    }

    private boolean canWire(BankAccount source, BankAccount target, double amount) {
        return !source.getId().equals(target.getId())
                && source.getCurrencyType().equals(target.getCurrencyType())
                && source.getBalance() > amount;
    }

    public void wireMoney(BankAccount source, BankAccount target, double amount) {
        if (canWire(source, target, amount)) {
            double amountWithFee = amount + source.calculateFee(amount);
            source.withdraw(amountWithFee);
            target.deposit(amount);
            System.out.println("Transfer successful");
        } else System.out.println("Transfer failed!");
    }

    public static Bank getInstance() {
        return instance;
    }

    public List<Client> getClients() {
        return clients;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "clients=" + clients +
                '}';
    }
}

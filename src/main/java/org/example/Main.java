package org.example;

import org.example.enums.CurrencyType;
import org.example.models.*;

public class Main {
    public static void main(String[] args) {
        // Creare conturi:
        BankAccount cont1=new ConsumerAccount(10000, CurrencyType.EUR);
        BankAccount cont2=new ConsumerAccount(15000, CurrencyType.USD);
        BankAccount cont4=new CorporateAccount(90000, CurrencyType.EUR);
        BankAccount cont5=new CorporateAccount(19000, CurrencyType.EUR);

        // creare clienti:
        Client client1=new Client();
        Client client2=new Client();

        client1.addBankAccount(cont1);
        client1.addBankAccount(cont4);

        client2.addBankAccount(cont2);
        client2.addBankAccount(cont5);

        Bank bank = new Bank();
        bank.addClient(client1);
        bank.addClient(client2);

        bank.wireMoney(client1.getBankAccounts().get(0),client2.getBankAccounts().get(0),100000);

        System.out.println(client1.getBankAccounts().get(0));
        System.out.println(client2.getBankAccounts().get(0));
    }
}
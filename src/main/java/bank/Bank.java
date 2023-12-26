package bank;

import client.Client;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    public static List<BankAccount> bankAccountList;

    static {
        bankAccountList = new ArrayList<>();

        Client firstClient = new Client(
                "Ivan", "Ivanov", 1000000000000L);
        BankAccount bankAccount = new BankAccount(firstClient, 123456789L);

        bankAccountList.add(bankAccount);
    }
}

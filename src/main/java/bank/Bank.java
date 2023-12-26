package bank;

import client.Client;
import client.DebitCard;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    public static List<BankAccount> bankAccountList;

    static {
        bankAccountList = new ArrayList<>();

        DebitCard card = new DebitCard(12345678L, 1234);
        Client firstClient = new Client(
                "Ivan", "Ivanov", 1000000000000L, card);
        BankAccount bankAccount = new BankAccount(firstClient, 123456789L);

        bankAccountList.add(bankAccount);
    }
}

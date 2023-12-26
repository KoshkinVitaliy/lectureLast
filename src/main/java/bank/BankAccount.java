package bank;

import client.Client;

public class BankAccount {
    private Client client;
    private long bankAccountID;

    public BankAccount(Client client, long bankAccountID) {
        this.client = client;
        this.bankAccountID = bankAccountID;
    }

    public Client getClient() {
        return client;
    }

    public long getBankAccountID() {
        return bankAccountID;
    }
}

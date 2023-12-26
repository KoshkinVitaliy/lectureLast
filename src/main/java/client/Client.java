package client;

public class Client {
    private String name;
    private String surname;
    private long clientID;
    private DebitCard debitCard;

    public Client(String name, String surname, long clientID) {
        this.name = name;
        this.surname = surname;
        this.clientID = clientID;
    }

    public Client(String name, String surname,
                  long clientID, DebitCard debitCard) {
        this.name = name;
        this.surname = surname;
        this.clientID = clientID;
        this.debitCard = debitCard;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public long getClientID() {
        return clientID;
    }

    public DebitCard getDebitCard() {
        return debitCard;
    }
}

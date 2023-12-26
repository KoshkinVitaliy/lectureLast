package client;

public class DebitCard {
    private final long cardID;
    private int pinCode;

    public DebitCard(long cardID, int pinCode) {
        this.cardID = cardID;
        this.pinCode = pinCode;
    }

    public int getPinCode() {
        return pinCode;
    }

    public long getCardID() {
        return cardID;
    }
}

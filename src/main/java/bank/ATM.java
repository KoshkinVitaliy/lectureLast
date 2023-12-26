package bank;

import java.util.Scanner;

public class ATM {
    public void takeCard() {
        showStartMenu();
    }

    private void showStartMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер карты: ");

        long inputCardID = Long.getLong(scanner.nextLine());

        checkCardID(inputCardID);
    }

    private void checkCardID(long inputCardID) {
        for (BankAccount account: Bank.bankAccountList) {
            if (account.getClient().getDebitCard().getCardID() == inputCardID) {
                askPinCode(account);
            }
            else {
                System.out.println("Неверный номер карты. Попробуйте ещё.");
                showStartMenu();
            }
        }
    }

    private void askPinCode(BankAccount account) {
        Scanner scanner = new Scanner(System.in);
        int inputPinCode = Integer.parseInt(scanner.nextLine());

        if (account.getClient().getDebitCard().getPinCode() == inputPinCode) {
            System.out.println("Добро пожаловать, "
                    + account.getClient().getName() + "!");
        }
    }
}

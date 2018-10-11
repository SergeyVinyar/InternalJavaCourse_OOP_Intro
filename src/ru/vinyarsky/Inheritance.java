package ru.vinyarsky;

public class Inheritance {

    public static void main(String[] args) {

        System.out.println("--- Account account = new Account(); ---");

        Account account = new Account();
        System.out.println(account.getNumber());
        account.open();
        account.close();

        System.out.println();
        System.out.println("--- Account account = new CardAccount() ---");

        account = new CardAccount();
        System.out.println(account.getNumber());
        account.open();
        account.close();

        // ОШИБКИ КОМПИЛЯЦИИ
//        System.out.println(account.getCardNumber());
//        account.replenish();
//        account.withdraw();

        System.out.println();
        System.out.println("--- CardAccount cardAccount = new CardAccount() ---");

        CardAccount cardAccount = new CardAccount();
        System.out.println(cardAccount.getNumber());
        cardAccount.open();
        cardAccount.close();
        System.out.println(cardAccount.getCardNumber());
        cardAccount.replenish(20);
        cardAccount.withdraw(10);
    }
}

class Account {

    String getNumber() {
        return this.getClass().getSimpleName() + ": number";
    }

    void open() {
        System.out.println(this.getClass().getSimpleName() + ": open");
    }

    void close() {
        System.out.println(this.getClass().getSimpleName() + ": close");
    }
}

class CardAccount extends Account {

    String getCardNumber() {
        return this.getClass().getSimpleName() + ": card number";
    }

    void replenish(int value) {
        System.out.println(this.getClass().getSimpleName() + ": replenish");
    }

    void withdraw(int value) {
        System.out.println(this.getClass().getSimpleName() + ": withdraw");
    }
}
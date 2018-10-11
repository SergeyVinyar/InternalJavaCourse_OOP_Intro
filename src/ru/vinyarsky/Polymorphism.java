package ru.vinyarsky;

public class Polymorphism {

    public static void main(String[] args) {
        PolyCardAccount cardAccount = new PolyCardAccount();
        System.out.println(cardAccount.getNumber());

        PolyAccount account = new PolyCardAccount();
        System.out.println(account.getNumber());
    }
}

class PolyAccount {

    String getNumber() {
        return "12345";
    }
}

class PolyCardAccount extends PolyAccount {

    @Override
    String getNumber() {
        return "Card " + super.getNumber();
    }
}
package com.example.bestburgerdelivery.MainClasses;

public class Payment {
    String cardNumber;
    String cardBankId;
    String owner;

    public Payment(String cardNumber, String cardBankId, String owner) {
        setCardNumber(cardNumber);
        setCardBankId(cardBankId);
        setOwner(owner);
    }

    public String getCardNumber() {
        return cardNumber;
    }

    private void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardBankId() {
        return cardBankId;
    }

    private void setCardBankId(String cardBankId) {
        this.cardBankId = cardBankId;
    }

    public String getOwner() {
        return owner;
    }

    private void setOwner(String owner) {
        this.owner = owner;
    }
}

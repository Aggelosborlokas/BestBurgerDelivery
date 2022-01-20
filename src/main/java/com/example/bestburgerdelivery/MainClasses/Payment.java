package com.example.bestburgerdelivery.MainClasses;

public class Payment {
    String cardNumber;
    String cardBankId;

    public Payment(String cardNumber, String cardBankId) {
        setCardNumber(cardNumber);
        setCardBankId(cardBankId);
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
}

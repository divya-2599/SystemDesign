package org.designPatternProblems.atm;

import lombok.Data;

@Data
public class Card {
    private int cardNumber;
    private int cvv;
    private int expiryDate;
    private BankAccount bankAccount;
    private String holderName;

    public boolean isCorrectPinEntered(int pin) {
        if(pin==cvv) {
            return true;
        }
        return false;
    }

    public int getBankBalance() {
        return bankAccount.getBalance();
    }

    public int withdrawBalance(int amount) {
        return bankAccount.withdrawBalance(amount);
    }
}

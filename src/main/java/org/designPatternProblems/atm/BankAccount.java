package org.designPatternProblems.atm;

import lombok.Data;

@Data
public class BankAccount {
    private int accountNo;
    private int balance;

    public int withdrawBalance(int amount) {
        return balance-amount;
    }
}

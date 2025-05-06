package org.designPatternProblems.atm.state;

import org.designPatternProblems.atm.ATM;
import org.designPatternProblems.atm.Card;

public class CheckBalanceState extends ATMState {

    @Override
    public void displayBalance(ATM atm, Card card) {
        System.out.println("Your balance is : " + card.getBankBalance());
        exit(atm);
    }
}

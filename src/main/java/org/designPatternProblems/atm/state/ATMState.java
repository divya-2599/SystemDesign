package org.designPatternProblems.atm.state;

import org.designPatternProblems.atm.ATM;
import org.designPatternProblems.atm.Card;
import org.designPatternProblems.atm.TransationType;

public abstract class ATMState {
    public void insertCard(ATM atm, Card card) {
        System.out.println("OOPS! Something went wrong");
    }

    public void authenticatePin(ATM atm, Card card, int pin) {
        System.out.println("OOPS! Something went wrong");
    }

    public void selectOperation(ATM atm, Card card, TransationType transactionType) {
        System.out.println("OOPS! Something went wrong");
    }

    public void cashWithdrawl(ATM atm, Card card, int withdrawlAmount) {
        System.out.println("OOPS! Something went wrong");
    }

    public void displayBalance(ATM atm, Card card) {
        System.out.println("OOPS! Something went wrong");
    }

    public void exit(ATM atm) {
        returnCard();
        atm.setAtmCurrentState(new IdleState());
        System.out.println("Exit done");
    }

    public void returnCard() {
        System.out.println("Please collect your card");
    }

}

package org.designPatternProblems.atm.state;

import org.designPatternProblems.atm.ATM;
import org.designPatternProblems.atm.Card;

public class IdleState extends ATMState {

    @Override
    public void insertCard(ATM atm, Card card) {
        System.out.println("Card is inserted");
        atm.setAtmCurrentState(new HasCardState());
    }
}

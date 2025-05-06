package org.designPatternProblems.atm.state;

import org.designPatternProblems.atm.ATM;
import org.designPatternProblems.atm.Card;

public class HasCardState extends ATMState {

    public HasCardState() {
        System.out.println("Please enter your pin card number");
    }

    @Override
    public void authenticatePin(ATM atm, Card card, int pin) {
        if(card.isCorrectPinEntered(pin)) {
            atm.setAtmCurrentState(new SelectOperationState());
        }else{
            System.out.println("Invalid pin number");
            exit(atm);
        }
    }
}
